package lesson6;

public interface Defendable {
    void defend();

    default void attack() {
        System.out.println("Атакует");
    }
}
