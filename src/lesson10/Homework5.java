package lesson10;

import lesson10.advanced.HomeworkAdvanced;
import lesson10.base.FinancialRecord;
import lesson10.base.HomeworkBase;
import lesson10.expert.HomeworkExpert;
import lesson10.expert.ShopNameException;

import java.io.IOException;

public class Homework5 {
    public static void main(String[] args) throws IOException {
        //Базовая
        //Задача №1
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"
        HomeworkBase.readAndWriteOnDisplay();
        //Задача №2
        //Необходимо:
        // 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework5, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300
        FinancialRecord financialRecord = new FinancialRecord(500, 300);
        HomeworkBase.writerInFile(financialRecord);
        //Продвинутый уровень
        //Задача №1
        // 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов (объектов класса FinancialRecord),
        // с разными доходами и расходами (Смотри класс new Random(1).nextInt(10000) )
        // 4. Записать в файл "report_2.txt" все данные из отчетов.
        // 5. Прочитать файл report_2.txt, просуммировать все доходы и вывести на экран,
        // то же самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        HomeworkAdvanced.writeOnDisplayAllIncomesAndAllOutcomes();
        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц,
        // 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        //Сгенерировать отчеты нужно через DataGenerator
        //В path указать путь до папки, где сгенерятся отчеты
        //String path = "";
        //DataGenerator.createReports(path);
        HomeworkExpert.generateReports();
        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд
        String shopName = "pyterochka";
        try {
            HomeworkExpert.getReportOfFinalProfit(shopName);
        } catch (ShopNameException e) {
            System.out.println(e.getMessage());
        }
        // Задача №2
        // Необходим составить отчет о расходах всех магазинов за весь период в разбивке по магазинам
        // (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результат:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд
        HomeworkExpert.getReportOfFinalOutcome();
    }
}
