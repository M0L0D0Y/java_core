package lesson2.homework;

import java.util.List;

public class Homework1 {
    private static final char HIDDEN_SIGN = '*';
    private static final String EMAIL_SPLIT = "@";
    private static final char POINT = '.';
    private static final String PERSON_DATA_SPLIT = ";";
    private static final String ONE_GLOBAL_SPLIT = "<data>";
    private static final String TWO_GLOBAL_SPLIT = "</d";

    private static final String END_STRING = "</data></client>";

    public static void main(String[] args) {
        //Базовая домашка
        //Задача №1
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.00202130120
        taskOne();
        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка,
        // отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад,
        // если до 11 лет в младшую школу,
        // если до 17 лет в среднюю школу,
        // иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел в сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        System.out.println(taskTwo(ageChildren));
        // Задание №3
        // Дано:

        //Курица
        boolean chicken = false;
        //Овощи
        boolean vegetables = false;
        //Соус
        boolean sour = true;
        //Хлеб
        boolean toast = true;
        //Колбаса
        boolean sausage = false;
        //Яйца
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному).
        // Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        System.out.println(taskThree(chicken, vegetables, sour, toast, sausage, eggs));
        //Продвинутая
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        System.out.println(taskFour("234", "some_text"));
        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        System.out.println(taskFive(3, 5));
        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        System.out.println(taskSix(hasFuel, hasElectricsProblem, hasMotorProblem,
                hasTransmissionProblem, hasWheelsProblem));//В условии не сказано 2 или более поломок.
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
        String data = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String nullData = "<client>(Какие то данные)<data></data></client>";
        List<String> personDataList = List.of(fullData, data, nullData);
        for (String str : personDataList) {
            System.out.println(taskSeven(str));
        }
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

    public static String encryptionEmail(String personDateEmail) {
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

    public static void taskOne() {
        double weigth = 70;
        double height = 1.70;
        double index = weigth / (height * height);
        System.out.println(index);
    }

    public static String taskTwo(int ageChildren) {
        if (ageChildren < 6) {
            return "пошел в сад";
        }
        if (ageChildren < 11) {
            return "пошел в младшую школу";
        }
        if (ageChildren < 17) {
            return "пошел в среднюю школу";
        }
        return "пошел в университет";
    }

    public static String taskThree(boolean chicken, boolean vegetables, boolean sour,
                                   boolean toas, boolean sausage, boolean eggs) {
        if (chicken && vegetables && sour && toas) {
            return "Цезарь";
        }
        if (vegetables && sausage || chicken && eggs) {
            return "Оливье";
        }
        if (vegetables) {
            return "Овощной салат";
        }
        return "У меня ничего нет";
    }

    public static int taskFour(String num, String someText) {
        int number = 0;
        try {
            number = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
        int var = someText.length();
        return number + var;
    }

    public static double taskFive(int a, int b) {
        return Math.pow((a + b), 2);
    }

    public static double taskSix(boolean hasFuel, boolean hasElectricsProblem, boolean hasMotorProblem,
                                 boolean hasTransmissionProblem, boolean hasWheelsProblem) {
        int checkConsultation = 0;
        int checkMotorProblem = 0;
        int checkElectricsProblem = 0;
        int checkTransmissionProblem = 0;
        int checkWheelsProblem = 0;
        int discount = 0;
        int countProblem = 0;
        if (!hasFuel && hasElectricsProblem && hasMotorProblem && hasTransmissionProblem && hasWheelsProblem) {
            checkConsultation = 1000;
        }
        if (!hasMotorProblem) {
            checkMotorProblem = 10_000;
            countProblem++;
        }
        if (!hasElectricsProblem) {
            checkElectricsProblem = 5000;
            countProblem++;
        }
        if (!hasTransmissionProblem) {
            checkTransmissionProblem = 4000;
            countProblem++;
        }
        if (!hasWheelsProblem) {
            checkWheelsProblem = 2000;
            countProblem++;
        }
        if (countProblem == 2) {//В условии не сказано 2 или более поломок.
            discount = 10;
        }
        if (checkTransmissionProblem > 0 && (checkElectricsProblem > 0 || checkMotorProblem > 0)) {
            discount = 20;
        }
        double check;
        check = (checkConsultation + checkElectricsProblem +
                checkMotorProblem + checkTransmissionProblem + checkWheelsProblem);
        if (discount != 0) {
            double sumDiscount = check / 100 * discount;
            check = check - sumDiscount;
        }
        return check;
    }
}
