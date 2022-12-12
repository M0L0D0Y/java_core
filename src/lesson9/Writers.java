package lesson9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writers {
    public static void main(String[] args) throws IOException {
        //Запись
        String fileToWrite = "E:\\tutorial\\java_core_5\\test2.txt";

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileToWrite))) {
            fileWriter.write("Я стал программистом!");
        }


        FileWriter fileWriter2 = new FileWriter(fileToWrite, false);
        fileWriter2.write("И устроился на работу!");
        fileWriter2.close();

    }
}
