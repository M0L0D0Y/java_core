package lesson6.homework.advanced.task1.model;

import lesson6.homework.advanced.task1.interfaces.Blossom;

public class Fern extends Plant implements Blossom {
    @Override
    public void blossom() {
        System.out.println("папоротник: умеет цвести");
    }
}
