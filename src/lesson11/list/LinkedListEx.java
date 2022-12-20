package lesson11.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        //LinkedList<Integer> integers = new LinkedList<>();
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(10);
//        myLinkedList.add(13);
//        myLinkedList.add(15);
//
//        System.out.println(myLinkedList.toString());

        LinkedList<Integer> integers = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            integers.add(0, new Integer(i));
            if (i % 10_000 == 0) {
                System.out.println(i + " done");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
