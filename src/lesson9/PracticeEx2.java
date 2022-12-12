package lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public class PracticeEx2 {
    public static void main(String[] args) throws IOException {

        Function<Integer, Integer> function = (a) -> a + 1;
        //Дан файл, с следующим содержанием:
        //price;carModel;mileage
        //10_000;bmw;20_000
        String carFileName = "E:\\tutorial\\java_core_5\\cars.csv";
        int countAllLines = countLines(carFileName);
        Car[] cars = new Car[countAllLines];
        readCarsToArray(carFileName, cars);
        System.out.println(Arrays.toString(cars));
    }

    public static void readCarsToArray(String filename, Car[] cars) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int countLines = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                if (countLines == 0) {
                    countLines++;
                    continue;
                }
                String[] fields = line.split(";");
                double price = Double.parseDouble(fields[0]);
                String model = fields[1];
                double mileage = Double.parseDouble(fields[2]);
                Car car = new Car(price, model, mileage);
                cars[countLines-1] = car;
                countLines++;
            }
        }
    }

    public static int countLines(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int countLines = 0;
            while (reader.ready()) {
                reader.readLine();
                countLines++;
            }
            return countLines - 1;
        }
    }
}
