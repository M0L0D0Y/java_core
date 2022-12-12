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
    private static final char DOT = '.';
    private static final char COMMA = ',';
    private static final String SHOP_OKAY = "okey";
    private static final String SHOP_PYTEROCHKA = "pyterochka";
    private static final String SHOP_YDOMA = "ydoma";
    private static final String SHOP_PEREKRESTOK = "perekrestok";
    private static final int INCOME = 1;
    private static final int OUTCOME = 2;
    private static final int DATE = 3;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 13;
    private static final int COUNT_SHOP = 4;


    public static void generateReports() throws IOException {
        DataGenerator.createReports(PATH);
    }
/**не знаю какой вариант нужен для решения экспертной задачи №1*/
    public static void getReportOfFinalProfit() throws IOException {
        /*String[] reportsProfitOkay = new String[MAX_VALUE];
        String[] reportsProfitPyterochka = new String[MAX_VALUE];
        String[] reportsProfitYdoma = new String[MAX_VALUE];
        String[] reportsProfitPerekrestok = new String[MAX_VALUE];
        List<String[]> reports = List.of(reportsProfitPyterochka,
                reportsProfitPerekrestok,
                reportsProfitOkay,
                reportsProfitYdoma);*/
        String[] reports = new String[MAX_VALUE];
        for (int i = 1; i < 13; i++) {
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
                    if (fields[MIN_VALUE].equals(SHOP_PYTEROCHKA)) {
                        addReportProfit(i, fields, reports, SHOP_PYTEROCHKA);
                    }
                    /*switch (fields[MIN_VALUE]) {
                        case SHOP_OKAY -> addReportProfit(i, fields, reportsProfitOkay, SHOP_OKAY);

                        case SHOP_YDOMA -> addReportProfit(i, fields, reportsProfitYdoma, SHOP_YDOMA);

                        case SHOP_PEREKRESTOK -> addReportProfit(i, fields, reportsProfitPerekrestok, SHOP_PEREKRESTOK);

                        case SHOP_PYTEROCHKA -> addReportProfit(i, fields, reportsProfitPyterochka, SHOP_PYTEROCHKA);
                    }*/
                }
            }
        }
        System.out.println("Экспертный уровень. Задача №1");
        /*for (String[] report : reports) {
            for (String record : report) {
                System.out.println(record);
            }
        }*/
        for (String report : reports) {
            System.out.println(report);
        }
    }

    public static void getReportOfFinalOutcome() throws IOException {
        String[] reports = new String[COUNT_SHOP];
        for (int i = 1; i < 13; i++) {
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
                    switch (fields[MIN_VALUE]) {
                        case SHOP_OKAY -> {
                            int index = 0;
                            addReportOutcome(index, fields, reports, SHOP_OKAY);
                        }

                        case SHOP_YDOMA -> {
                            int index = 1;
                            addReportOutcome(index, fields, reports, SHOP_YDOMA);
                        }

                        case SHOP_PEREKRESTOK -> {
                            int index = 2;
                            addReportOutcome(index, fields, reports, SHOP_PEREKRESTOK);
                        }

                        case SHOP_PYTEROCHKA -> {
                            int index = 3;
                            addReportOutcome(index, fields, reports, SHOP_PYTEROCHKA);
                        }
                    }
                }
            }
        }
        System.out.println("\nЭкспертный уровень. Задача №2");
        for (String report : reports) {
            System.out.println(report);
        }
    }

    private static void addReportOutcome(int index, String[] fields, String[] reports, String shop) {
        double outcomeFile = Double.parseDouble(fields[OUTCOME]);
        double outcome = MIN_VALUE;
        if (reports[index] != null) {
            String[] data = reports[index].split(REGEX_FOR_REPORT_OUTCOME);
            outcome = Double.parseDouble(data[1].replace(COMMA, DOT));
        }
        outcome += outcomeFile;
        String report = "Расходы " + shop + " за весь период : " + String.format(FORMAT, (outcome));
        reports[index] = report;
    }


    private static void addReportProfit(int i, String[] fields, String[] reports, String shop) {
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
        reports[MIN_VALUE] = shop;
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
