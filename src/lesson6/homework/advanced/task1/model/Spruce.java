package lesson6.homework.advanced.task1.model;

import lesson6.homework.advanced.task1.interfaces.Smell;

public class Spruce extends Wood implements Smell {
    public Spruce(String cones) {
        super(cones);
    }

    @Override
    public void smell() {
        System.out.println("ель : умееть пахнуть");
    }
}
