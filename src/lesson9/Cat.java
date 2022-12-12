package lesson9;

import java.io.Closeable;
import java.io.IOException;

public class Cat implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Кот закрылся");
    }
}
