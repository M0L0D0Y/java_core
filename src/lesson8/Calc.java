package lesson8;

public class Calc {

    public static Integer add(int a, int b) throws MyFirstException {
        if (b == 0) {
            throw new MyFirstException("Ошибка, б = 0");
        }
        if (a > 10) {
            throw new RuntimeException("Десятки не должно быть");
        }
        return a + b;
    }
}
