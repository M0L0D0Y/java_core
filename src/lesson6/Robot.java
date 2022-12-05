package lesson6;

public class Robot implements Defendable {

    public void defend() {
        System.out.println("Робот охраняет");
    }

    @Override
    public void attack() {
        System.out.println("Робот атакует");
    }
}
