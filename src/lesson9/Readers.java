package lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readers {
    public static void main(String[] args) throws IOException {
        //Чтение
        String filename = "E:\\tutorial\\java_core_5\\test.txt";
        FileReader reader = new FileReader(filename);
        String result = "";
        while (reader.ready()) {
            result += (char) reader.read();
        }
        System.out.println(result);
        reader.close();
        System.out.println("_______________________________");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String resultBuffered = "";
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            resultBuffered += line + '\n';
        }
        System.out.println(resultBuffered);
        bufferedReader.close();
    }
}
