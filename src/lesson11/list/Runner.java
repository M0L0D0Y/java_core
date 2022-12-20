package lesson11.list;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        array[0] = 3;
        array[1] = 2;


        ArrayList<Integer> integers = new ArrayList<>();
        //Добавление
        integers.add(2);
        integers.add(0, 3);

        //Удаление объекта
        integers.remove(new Integer(2));
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        //Содержит элемент или нет
        boolean contains = integers.contains(3);

        //Выдать элемент по индексу
        Integer integer = integers.get(0);

        //Создание иммутабельного Листа со значениями
        List<Integer> integers1 = List.of(1, 3, 5);

        //Добавление значений из одного листа в другой лист
        integers.addAll(integers1);
        System.out.println(integers);

        //Пустой лист или нет
        boolean empty = integers.isEmpty();

        //Индекс элемента
        int i = integers.indexOf(5);

        //Содержит ли все элементы из другого листа
        boolean b = integers.containsAll(List.of(1, 5));

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 4, 5));


    }
}
