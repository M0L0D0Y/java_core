package lesson3.references;

import java.util.Arrays;

public class References {
    public static void main(String[] args) {
        int x = 5;
        int y = x;

        System.out.println(x);
        System.out.println(y);

        //Array - массив
        int[] apples = new int[3];
        apples[0] = 7;
        apples[1] = 5;
        apples[2] = 3;

        int[] apples2 = apples;
        apples2[0] = 10;
        System.out.println(Arrays.toString(apples2));
        System.out.println(Arrays.toString(apples));

        //Четыре друга
        int[] apples4 = {10, 2, 4, 5};
        System.out.println(Arrays.toString(apples4));

        //Без инициализации
        boolean[] applesNull = new boolean[3];
        System.out.println(Arrays.toString(applesNull));

        //Строки
        String text = "Yuri";
        String text2 = text;

        text2 = text2 + " hello";
        System.out.println(text);
        System.out.println(text2);

        //Вне массива
        //apples[3] = 10;
        //Столицу Франции
        // [П] [А] [Р] [И] [Ж]
    }
}
