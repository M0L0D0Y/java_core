package lesson6;

public class Dog extends Animal implements Defendable{
    public int countLegs;

    public Dog(String name, int countLegs) {
        super(name);
        this.countLegs = countLegs;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    public void defend() {
        System.out.println("Собака охраняет");
    }
}
