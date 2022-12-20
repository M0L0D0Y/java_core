package lesson11.generics;

public class Tv implements Output {
    @Override
    public void show() {
        System.out.println("Телевизор показывает");
    }

    public void soundOff() {
        System.out.println("Выключили звук у телевизора");
    }
}
