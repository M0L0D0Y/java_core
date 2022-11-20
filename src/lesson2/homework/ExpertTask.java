package lesson2.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpertTask {
    private static final char HIDDEN_SIGN = '*';
    private static final String EMAIL_SPLIT = "@";
    private static final char POINT = '.';
    private static final String PERSON_DATA_SPLIT = ";";
    private static final String ONE_GLOBAL_SPLIT = "<data>";
    private static final String TWO_GLOBAL_SPLIT = "</d";

    private static final String END_STRING = "</data></client>";

    public static void main(String[] args) {

        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
        // "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
        String fullData =
                "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String noEmailData = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String nullData = "<client>(Какие то данные)<data></data></client>";
        List<String> personDataList = List.of(fullData, noEmailData, nullData);
        for (String str : personDataList) {
            System.out.println(maskData(str));
        }
    }
    public static String maskData(String line) {
        Pattern tag = Pattern.compile("<data>(.*?)</data>");
        Matcher data = tag.matcher(line);
        String result = data.find() ? data.group(1) : "";

        Pattern split = Pattern.compile("[^;]+");
        Matcher items = split.matcher(result);
        List<String> output = new ArrayList<>();

        while (items.find()) {
            String current = items.group();

            if (current.matches("[\\d]{11}")) {
                output.add(current.replaceFirst("(\\d{4})(\\d{3})(\\d*)", String.format("$1%s$3", "*".repeat(3))));
            } else if (current.matches("[А-ЯA-zа-яa-b\\s]*")) {
                String[] names = current.split(" ");
                Pattern p = Pattern.compile("([А-ЯA-Z])([а-яa-z]*)([а-яa-z]{1}$)");
                Matcher name = p.matcher(names[0]);
                names[0] = name.find() ? name.group(1) +
                        "*".repeat(name.end(2) - name.start(2)) + name.group(3) : "";
                names[2] = names[2].charAt(0) + ".";
                output.add(String.join(" ", names));
            } else if (current.matches(".+@.+")) {
                int begin = current.indexOf('@') + 1;
                int end = current.indexOf('.', begin);
                String replacement = "*@" + "*".repeat(end-begin);
                output.add(current.replaceAll("([\\w.-_](?=@))@([\\w_-]+(?=.))", replacement));
            }
        }

        String out = String.join(";", output);
        if (out.isEmpty()) return line;
        return line.replaceFirst("(.+(?<=<data>))(.+(?=</data>))(.+)", String.format("$1%s$3", out));
    }

    public static String taskSeven(String data) {
        String maskedData = data;
        String[] personData = data.split(ONE_GLOBAL_SPLIT);
        String start = personData[0];
        if (personData[1].contains(PERSON_DATA_SPLIT)) {
            String[] onlyPersonData = personData[1].split(TWO_GLOBAL_SPLIT);
            String[] arrPersonData = onlyPersonData[0].split(PERSON_DATA_SPLIT);
            if (arrPersonData.length == 2) {
                String fio = encryptionFio(arrPersonData[0]);
                String number = encryptionNumber(arrPersonData[1]);
                StringBuilder sb = new StringBuilder();
                maskedData = String.valueOf(sb.append(start)
                        .append(ONE_GLOBAL_SPLIT)
                        .append(fio)
                        .append(PERSON_DATA_SPLIT)
                        .append(number)
                        .append(END_STRING));
            }
            if (arrPersonData.length == 3) {
                String fio = encryptionFio(arrPersonData[2]);
                String number = encryptionNumber(arrPersonData[0]);
                String email = encryptionEmail(arrPersonData[1]);
                StringBuilder sb = new StringBuilder();
                maskedData = String.valueOf(sb.append(start)
                        .append(ONE_GLOBAL_SPLIT)
                        .append(number)
                        .append(PERSON_DATA_SPLIT)
                        .append(email)
                        .append(PERSON_DATA_SPLIT)
                        .append(fio)
                        .append(END_STRING));
            }
        }
        return maskedData;
    }

    private static String encryptionEmail(String personDateEmail) {
        String[] personEmail = personDateEmail.split(EMAIL_SPLIT);
        String encryptionNickname = personEmail[0].substring(0, personEmail[0].length() - 1) + HIDDEN_SIGN;
        String[] domen = personEmail[1].split("\\.", 2);
        char[] encryptionDomen = domen[0].toCharArray();
        for (int i = 0; i < domen[0].length(); i++) {
            encryptionDomen[i] = HIDDEN_SIGN;
        }
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(encryptionNickname)
                .append(EMAIL_SPLIT)
                .append(encryptionDomen)
                .append(POINT)
                .append(domen[1]));
    }

    private static String encryptionNumber(String personDateNumber) {
        char[] number = personDateNumber.toCharArray();
        for (int i = 4; i < number.length - 4; i++) {
            number[i] = HIDDEN_SIGN;
        }
        return String.valueOf(number);
    }

    private static String encryptionFio(String personDateFio) {
        String[] fio = personDateFio.split(" ");
        char[] lastname = fio[0].toCharArray();
        for (int i = 1; i < lastname.length - 1; i++) {
            lastname[i] = HIDDEN_SIGN;
        }
        fio[0] = String.valueOf(lastname);
        char[] patronymic = fio[2].toCharArray();
        patronymic[1] = POINT;
        char[] patronymicPerson = new char[2];
        patronymicPerson[0] = patronymic[0];
        patronymicPerson[1] = patronymic[1];
        fio[2] = String.valueOf(patronymicPerson);
        String encryptionFio = "";
        StringBuilder sb = new StringBuilder();
        for (String str : fio) {
            encryptionFio = String.valueOf(sb.append(str).append(" "));
        }
        encryptionFio = encryptionFio.substring(0, encryptionFio.length() - 1);
        return encryptionFio;
    }
}
