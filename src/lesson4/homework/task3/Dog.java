package lesson4.homework.task3;

public class Dog extends Cat {


    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("гав");
    }
}
