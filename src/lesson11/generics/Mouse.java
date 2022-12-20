package lesson11.generics;

public class Mouse implements Input {
    @Override
    public void input() {
        System.out.println("Ввод с мыши");
    }

    public void scroll() {
        System.out.println("Прокрутка");
    }
}
