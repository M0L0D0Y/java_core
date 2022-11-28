package lesson6.homework.base.task1;

public class Computer extends Electronic {
    public Computer(Boolean flag) {
        super(flag);
    }

    public void loadSystem() {
        System.out.println("загрузка компьютера");
    }

    @Override
    public void work() {
        System.out.println("выполняет вычисления");
    }
}
