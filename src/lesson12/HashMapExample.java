package lesson12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Product, Integer> data = giveMeStorageWithApples();
        Product product = new Product("Apple");
        System.out.println(data.get(product));
        System.out.println(product.hashCode() % 15);

        //30 % 15 = 0
        //33 % 15 = 3
        //[1, 2, 5, 10, 17, 20]

        //[null ....., null] x 16
        //map.put(key, value) -> (key.hashcode() % (16 - 1)) + 1

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 15);
        linkedHashMap.put("Orange", 15);
        System.out.println(linkedHashMap);

    }

    public static HashMap<Product, Integer> giveMeStorageWithApples() {
        HashMap<Product, Integer> data = new HashMap<>();
        Product apple = new Product("Apple");
        data.put(apple, 100);
        return data;
    }
}
