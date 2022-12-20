package pet;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class RefactorFile {
    private static final String PATH_ORIGIN = "C:\\Users\\i7asc\\Desktop\\Pet.txt";
    private static final String PATH_REFACTOR = "C:\\Users\\i7asc\\Desktop\\Pet1.txt";

    public static void main(String[] args) throws IOException {
        refactorFile();
    }

    private static void refactorFile() throws IOException {
        List<String> stringList = new LinkedList<>();
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_ORIGIN))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                long countTab = line.chars().filter(ch -> ch == '\t').count();
                if (countTab == 3) {
                    count++;
                    refactorLine(line, count, stringList);
                } else {
                    count = 0;
                    stringList.add(line);
                }
            }
            for (String str : stringList) {
                writeLine(str);
            }
        }
        System.out.println("завершено");
    }

    private static void refactorLine(String line, int count, List<String> stringList) {
        String[] fields = line.split("\t", 4);
        fields[0] = "\t" + count + ".";
        fields[2] = " ";
        StringBuilder result = new StringBuilder();
        for (String str : fields) {
            if (str.equals(" ")) {
                continue;
            }
            result.append(str).append(" ");
        }
        stringList.add(String.valueOf(result));
    }

    private static void writeLine(String refactorLine) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_REFACTOR, true))) {
            bufferedWriter.write(refactorLine);
            bufferedWriter.newLine();
        }
    }
}
