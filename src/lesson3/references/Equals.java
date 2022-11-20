package lesson3.references;

public class Equals {
    public static void main(String[] args) {
        int x = 5;
        int y = x;

        if (x == y) {
            System.out.println("Ура х и у равны");
        }

        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};
        if (numbers1 == numbers2) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        String text = new String("yuri"); //a222312
        String text2 = new String("yur" + "i"); //bb772

        if (text == text2) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        if (text.equals(text2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

    }
}
