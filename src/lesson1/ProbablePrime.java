package lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.sqrt;

public class ProbablePrime {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int countPrimeNumber = 0;
        for (int i = startNumber; i > 1; i--) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime) {
                countPrimeNumber++;
            }
        }
        System.out.println(countPrimeNumber);
        System.out.println();
        System.out.println(IsSimple(startNumber));
        System.out.println();*/
        //qw();
        //findMaxValue();
        List<String> strings = List.of("Мама",
                "авТо",
                "гриБ",
                "Яблоко",
                "яБлоко",
                "ябЛоко",
                "яблОко",
                "яблоКо",
                "яблокО",
                "агент007",
                "стриж",
                "ГТО",
                "Три богатыря");
        for (String text : strings) {
            regex(text);
        }
    }

    public static void regex(String text) {
        Pattern pattern = Pattern.compile("^(?:[а-я]+[А-Я][а-я]*|[а-я]*[А-Я][а-я]+)$");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
    }

    public static boolean IsSimple(int ANum) {
        if (ANum < 2)
            return false;
        double s = sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }

    public static void qw() {
        char[] ancii = {'b', 'c', 'a', '!', 'a', 'f', 'A', 'j'};
        int[] array = new int[ancii.length];
        for (int i = 0; i < ancii.length; i++) {
            array[i] = ancii[i];
        }
        int max = getMaxValue(array);
        int[] sortedArray = countSort(array, max);
        for (int i = 0; i < ancii.length; i++) {
            ancii[i] = (char) sortedArray[i];
        }
        System.out.println(Arrays.toString(ancii));
    }

    public static int getMaxValue(int[] arr) {
        int maxValue = 0;
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue + 1;
    }

    public static int[] countSort(int[] arr, int max) {
        // создаем целочисленный массив размера `n` для хранения отсортированного массива
        int[] answer = new int[arr.length];

        // создать целочисленный массив размером `k + 1`, инициализированный всеми нулями
        int[] count = new int[max];

        // используя значение каждого элемента входного массива в качестве индекса,
        // сохраняем счетчик каждого целого числа в `freq[]`
        for (int j : arr) {
            count[j]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }

    public static void findMaxValue() {
        int max = Integer.MIN_VALUE;
        int[] arr = {0, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            getArr(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(binarySearch(arr, 0, arr.length - 1, max));
        }
    }

    private static void getArr(int[] arr) {
        int[] array = new int[arr.length];
        int length = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            int x = arr[length];//9
            array[0] = x;
            array[i] = arr[i - 1];
        }
        System.arraycopy(array, 0, arr, 0, array.length);
    }

    private static int binarySearch(int[] arr, int minIndex, int maxIndex, int maxValue) {
        int midIndex = (maxIndex + minIndex) / 2;
        if (arr[midIndex] > arr[minIndex]) {
            if (maxValue < arr[midIndex]) {
                maxValue = arr[midIndex];
            }
            minIndex = midIndex;
        } else {
            if (maxValue < arr[midIndex]) {
                maxValue = arr[minIndex];
            }
            maxIndex = midIndex;
        }
        if ((maxIndex - minIndex) == 1) {
            if (arr[maxIndex] > arr[minIndex]) {
                return Math.max(maxValue, arr[maxIndex]);
            } else {
                return Math.max(maxValue, arr[midIndex]);
            }
        }
        return binarySearch(arr, minIndex, maxIndex, maxValue);
    }
}