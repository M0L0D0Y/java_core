package lesson3.references;

public class Loops {
    public static void main(String[] args) {
        int[] apples = new int[3];
        apples[0] = 7;
        apples[1] = 5;
        apples[2] = 3;

        //foreach
//        for (int param : apples) {
//            System.out.println(param);
//        }

        //fori
//        for (int index = 0; index < 0; index++) {
//            System.out.println(apples[index]);
//        }

        int index = 0;
        //while
//        while(true) {
//            if (index >= 3) {
//                break;
//            }
//            System.out.println(apples[index]);
//            index++;
//
//        }

        int index2 = 0;
        //do while
//        do {
//            System.out.println(apples[index2]);
//            index2++;
//        } while(index2 < 0);

        //Преставим себе, что нам надо распечатать первые 5 значений из массива
        int[] numbers = {10,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(numbers[i]);
//        }

        //Преставим себе, что нам надо распечатать последние 5 значений из массива
        int[] numbers2 = {1,2,3};
//        System.out.println(numbers2.length);
//        System.out.println(numbers2[numbers2.length - 1]);
//        for (int i = (numbers.length - 5); i < numbers.length ; i++) {
//            System.out.printf(numbers[i] + " ");
//        }

        //Пропустить первые 5 элементов
//        for (int i = 0; i < numbers.length; i++) {
//            if (i < 5) {
//                continue;
//            }
//            System.out.println(numbers[i]);
//        }
        // 0 1 2 3
        // 1 3 4 5

        int[] row1 = {0, 1, 2, 3};
        int[] row2 = {1, 3, 4, 5};
        int[][] nestedNumbers = {row1, row2};
        parentfor:
        for (int i = 0; i < nestedNumbers.length; i++) {
            for (int j = 0; j < nestedNumbers[i].length; j++) {
                if (nestedNumbers[i][j] == 3) {
                    break parentfor;
                }
                System.out.println(nestedNumbers[i][j]);
            }
        }

    }
}
