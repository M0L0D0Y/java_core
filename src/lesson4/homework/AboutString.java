package lesson4.homework;

public class AboutString {
    public static void main(String[] args) {
        String name = "Юрий";
        //Длина строки
        int length = name.length();
        System.out.println(length);

        //Все буквы заглавные
        String newName = name.toUpperCase();
        System.out.println(newName);

        //Все буквы маленькие
        String nameLower = name.toLowerCase();
        System.out.println(nameLower);

        //Обрезка строки
        String substring = name.substring(1, 3);
        System.out.println(substring);

        //Объединение строк (Конкатенация)
        String myWorld = "Мой мир!";
        String newPhrase = name + " " + myWorld;
        System.out.println(newPhrase);

        //Удаление лишних пробелов (в конце и в начале)
        String phrase = "     OPA      ";
        String trim = phrase.trim();
        System.out.println(trim);

        //Много раз одно и то же слово
        String repeatedName = name.repeat(10);
        System.out.println(repeatedName);

        //Содержит ли какую то букву или текст
        boolean containsLetter = name.contains("и");
        System.out.println(containsLetter);

        //Индекс (позиция) текста или буквы в тексте
        int index = name.indexOf("й");
        System.out.println(index);

        //Получение символа из текста по позиции
        char symbol = name.charAt(index);
        System.out.println(symbol);

        String nameSecond = "Юрий\\n";
        System.out.println(nameSecond.repeat(10));
    }
}