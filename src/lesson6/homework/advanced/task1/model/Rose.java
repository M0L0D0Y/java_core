package lesson6.homework.advanced.task1.model;

import lesson6.homework.advanced.task1.interfaces.Blossom;
import lesson6.homework.advanced.task1.interfaces.Smell;

public class Rose extends Plant implements Blossom, Smell {
    @Override
    public void blossom() {
        System.out.println("роза: умеет цвести");
    }

    @Override
    public void smell() {
        System.out.println("роза: умееть пахнуть");
    }
}
