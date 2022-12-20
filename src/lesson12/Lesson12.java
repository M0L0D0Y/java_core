package lesson12;

import java.util.HashMap;
import java.util.Map;

public class Lesson12 {
    public static void main(String[] args) {
        // "France": 80_000_000
        // "France" - key (Ключ - уникален), "Paris" - value (оно не уникально)
        // "Spain": 40_000_000
        Map<String, Long> map = new HashMap<>();
        map.put("France", 80_000_000L);
        map.put("Spain", 40_000_000L);
        System.out.println(map);
        Long countPeopleOfFrance = map.get("France");
        System.out.println(countPeopleOfFrance);

        Long countPeopleOfChina = map.getOrDefault("China", 0L);
        System.out.println(countPeopleOfChina);

//        System.out.println(map.values());
        map.put("France", 66_086_208L);
        System.out.println(map);

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
