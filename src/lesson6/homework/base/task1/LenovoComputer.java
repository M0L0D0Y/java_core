package lesson6.homework.base.task1;

public class LenovoComputer extends Computer {
    public LenovoComputer(Boolean flag) {
        super(flag);
    }

    public void loadSystem() {
        System.out.println("загрузка Lenovo");
    }
}
