package lesson10.expert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeworkExpert {
    private static final String PATH = "C:\\Users\\i7asc\\Desktop\\JavaCore\\java_core\\resource";
    private static final String NAME_REPORT = "\\report_XX_2012.txt";
    private static final String NUMBER_MONTH = "XX";
    private static final String REGEX_LINE = ";";
    private static final String REGEX_DATE = "/";
    private static final String REGEX_FOR_REPORT_PROFIT = ": ";
    private static final String REGEX_FOR_REPORT_OUTCOME = " : ";
    private static final String FORMAT = "%.2f";
    private static final String FIRST_CHAR_DATE = "0";
    private static final String PROFIT_BY_SHOP = "Прибыль по магазину ";
    private static final String BY_MONTH = " по месяцам";
    private static final char DOT = '.';
    private static final char COMMA = ',';
    private static final int INCOME = 1;
    private static final int OUTCOME = 2;
    private static final int DATE = 3;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 13;
    private static final int COUNT_SHOP = 4;

    private HomeworkExpert() {
    }


    public static void generateReports() throws IOException {
        DataGenerator.createReports(PATH);
    }

    public static void getReportOfFinalProfit(ShopName shopName) throws IOException {
        String[] reports = new String[MAX_VALUE];
        for (int i = 1; i < MAX_VALUE; i++) {
            String path = getPath(i);
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                int countLine = MIN_VALUE;
                while (reader.ready()) {
                    String line = reader.readLine();
                    if (countLine == MIN_VALUE) {
                        countLine++;
                        continue;
                    }
                    String[] fields = line.split(REGEX_LINE);
                    if (fields[MIN_VALUE].equals(shopName.toString().toLowerCase())) {
                        addReportProfit(i, fields, reports, shopName);
                    }
                }
            }
        }
        System.out.println("Экспертный уровень. Задача №1");
        for (String report : reports) {
            System.out.println(report);
        }
    }

    public static void getReportOfFinalOutcome() throws IOException {
        String[] reports = new String[COUNT_SHOP];
        for (int i = 1; i < MAX_VALUE; i++) {
            String path = getPath(i);
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                int countLine = MIN_VALUE;
                while (reader.ready()) {
                    String line = reader.readLine();
                    if (countLine == MIN_VALUE) {
                        countLine++;
                        continue;
                    }
                    String[] fields = line.split(REGEX_LINE);
                    divideByShop(fields, reports);
                }
            }
        }
        System.out.println("\nЭкспертный уровень. Задача №2");
        for (String report : reports) {
            System.out.println(report);
        }
    }

    private static void divideByShop(String[] fields, String[] reports) {
        ShopName nameShop = ShopName.valueOf(fields[MIN_VALUE].toUpperCase());
        switch (nameShop) {
            case OKEY -> addReportOutcome(fields, reports, ShopName.OKEY);

            case YDOMA -> addReportOutcome(fields, reports, ShopName.YDOMA);

            case PEREKRESTOK -> addReportOutcome(fields, reports, ShopName.PEREKRESTOK);

            case PYTEROCHKA -> addReportOutcome(fields, reports, ShopName.PYTEROCHKA);
        }
    }

    private static void addReportOutcome(String[] fields, String[] reports, ShopName shopName) {
        double outcomeFile = Double.parseDouble(fields[OUTCOME]);
        double outcome = MIN_VALUE;
        if (reports[shopName.getIndex()] != null) {
            String[] data = reports[shopName.getIndex()].split(REGEX_FOR_REPORT_OUTCOME);
            outcome = Double.parseDouble(data[1].replace(COMMA, DOT));
        }
        outcome += outcomeFile;
        String report = "Расходы " + shopName.toString().toLowerCase() +
                " за весь период : " + String.format(FORMAT, (outcome));
        reports[shopName.getIndex()] = report;
    }


    private static void addReportProfit(int i, String[] fields, String[] reports, ShopName shopName) {
        double income = Double.parseDouble(fields[INCOME]);
        double outcome = Double.parseDouble(fields[OUTCOME]);
        String[] date = fields[DATE].split(REGEX_DATE);
        String year = date[date.length - 1];
        double profit = MIN_VALUE;
        if (reports[i] != null) {
            String[] data = reports[i].split(REGEX_FOR_REPORT_PROFIT);
            profit = Double.parseDouble(data[1].replace(COMMA, DOT));
        }
        profit = profit + (income - outcome);
        String report = getDate(i, year) + REGEX_FOR_REPORT_PROFIT + String.format(FORMAT, (profit));
        reports[MIN_VALUE] = PROFIT_BY_SHOP + shopName.toString().toLowerCase() + BY_MONTH;
        reports[i] = report;
    }

    private static String getDate(int i, String year) {
        String date = null;
        if (i < 10) {
            date = FIRST_CHAR_DATE + i + DOT + year;
        }
        if (i > 9) {
            String month = String.valueOf(i);
            date = month + DOT + year;
        }
        return date;
    }

    private static String getPath(int numberMonth) {
        String path = null;
        String number;
        if (numberMonth < 10) {
            number = FIRST_CHAR_DATE + numberMonth;
            path = PATH + NAME_REPORT.replaceFirst(NUMBER_MONTH, number);
        }
        if (numberMonth > 9) {
            number = String.valueOf(numberMonth);
            path = PATH + NAME_REPORT.replaceFirst(NUMBER_MONTH, number);
        }
        return path;
    }
}
