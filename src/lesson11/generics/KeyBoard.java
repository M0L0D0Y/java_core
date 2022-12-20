package lesson11.generics;

public class KeyBoard implements Input {
    @Override
    public void input() {
        System.out.println("Ввод с клавиатуры");
    }

    public void exit() {
        System.out.println("Нажали ctrl alt delete");
    }
}
