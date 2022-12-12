package lesson9;

import java.io.*;

public class PracticeEx {
    public static void main(String[] args) throws IOException {
        //Создать файл с 5 строками, на каждой строке будут числа, от 1 до 5
        //Создать второй файл только с четными числами
        String numbersFile = "E:\\tutorial\\java_core_5\\numbers.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numbersFile));) {
           writeNumbers(writer, 1, 5);
        }

        String oddNumbersFile = "E:\\tutorial\\java_core_5\\odd_numbers.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(numbersFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(oddNumbersFile))) {
            String oddNumbers = readOnlyOddNumbers(bufferedReader);
            writer.write(oddNumbers);
        }
    }

    public static String readOnlyOddNumbers(BufferedReader reader) throws IOException {
        String result = "";
        while (reader.ready()) {
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            if (number % 2 == 0) {
                result += number + "\n";
            }
        }
        return result;
    }

    public static void writeNumbers(BufferedWriter writer, int from, int to) throws IOException {
        for (int i = from; i <= to; i++) {
            writer.write(String.valueOf(i));
            writer.newLine();
        }
    }
}
