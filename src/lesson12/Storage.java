package lesson12;

import java.util.HashMap;

public class Storage {
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("Apples", 100);
        Integer worker1CountApples = 10;
        data.put("Apples", worker1CountApples);
        Integer apples = data.getOrDefault("Apples", 0);
        data.put("Apples", apples + worker1CountApples);

    }
}
