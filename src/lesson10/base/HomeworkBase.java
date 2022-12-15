package lesson10.base;

import java.io.*;

public class HomeworkBase {
    private HomeworkBase() {
    }

    public static void readAndWriteOnDisplay() throws IOException {
        String path = "C:\\Users\\i7asc\\Desktop\\JavaCore\\java_core\\my_first_file.txt";
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                String line = reader.readLine();
                result.append(line).append(" ");
            }
        }
        System.out.println("Базовый уровень. Задача №1\n"+result+"\n");
    }

    public static void writerInFile(FinancialRecord financialRecord) throws IOException {
        String path = "C:\\Users\\i7asc\\Desktop\\JavaCore\\java_core\\report.txt";
        StringBuilder string = new StringBuilder();
        string.append("доходы = ")
                .append(financialRecord.getIncomes())
                .append(", расходы = ")
                .append(financialRecord.getOutcomes());
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(path))) {
            fileWriter.write(String.valueOf(string));
        }
        System.out.println("Базовый уровень. Задача №2\nСмотри файл report.txt\n");
    }
}
