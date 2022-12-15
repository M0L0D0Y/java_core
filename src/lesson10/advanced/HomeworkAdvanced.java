package lesson10.advanced;

import lesson10.base.FinancialRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeworkAdvanced {
    private static final Random RANDOM = new Random(1);
    private static final Integer MAX_VALUE = 10000;
    private static final String PATH = "C:\\Users\\i7asc\\Desktop\\JavaCore\\java_core\\report2.txt";
    private static final String REGEX = ",";
    private static final String INCOMES = "доходы = ";
    private static final String ALL_INCOMES = "общие доходы - ";
    private static final String OUTCOMES = ", расходы = ";
    private static final String ALL_OUTCOMES = ", общие расходы - ";
    private static final List<FinancialRecord> financialRecordList = new ArrayList<>();

    private static final int COUNT_REPORT = 10;

    private HomeworkAdvanced() {
    }

    public static void writeOnDisplayAllIncomesAndAllOutcomes() throws IOException {
        generatorFinancialRecord();
        writerInFile();
        readAndWriteOnDisplay();
    }

    private static void generatorFinancialRecord() {
        for (int i = 0; i < COUNT_REPORT; i++) {
            Integer incomes = RANDOM.nextInt(MAX_VALUE);
            Integer outcomes = RANDOM.nextInt(MAX_VALUE);
            FinancialRecord financialRecord = new FinancialRecord(incomes, outcomes);
            financialRecordList.add(financialRecord);
        }
    }

    private static void writerInFile() throws IOException {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(PATH))) {
            for (FinancialRecord financialRecord : HomeworkAdvanced.financialRecordList) {
                String string = INCOMES +
                        financialRecord.getIncomes() +
                        OUTCOMES +
                        financialRecord.getOutcomes();
                fileWriter.write(string);
                fileWriter.newLine();
            }
        }
    }

    private static void readAndWriteOnDisplay() throws IOException {
        int allIncomes = 0;
        int allOutcomes = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] fields = line.split(REGEX);
                allIncomes += Integer.parseInt(fields[0].substring(INCOMES.length()));
                allOutcomes += Integer.parseInt(fields[1].substring(OUTCOMES.length()));
            }
        }
        System.out.println("Продвинутый уровень\n" + ALL_INCOMES + allIncomes + ALL_OUTCOMES + allOutcomes + "\n");
    }
}
