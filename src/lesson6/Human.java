package lesson6;

public class Human {
    public static int count = 0;
    public final static String PREFIX = "Mr.";
    public String name;

    public Human(String newName) {
        this.name = PREFIX + newName;
        count++;
    }

    public static void hello() {
        System.out.println("Hello!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
