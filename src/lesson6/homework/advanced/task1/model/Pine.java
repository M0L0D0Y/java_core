package lesson6.homework.advanced.task1.model;

import lesson6.homework.advanced.task1.interfaces.Smell;

public class Pine extends Wood implements Smell {
    public Pine(String cones) {
        super(cones);
    }

    @Override
    public void smell() {
        System.out.println("сосна : умеет пахнуть");
    }
}
