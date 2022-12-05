package lesson6;

import lesson5.Lesson5;

public class Lesson6 {
    public static void main(String[] args) {
       //animalExample();
       //defenderExample();
        //humanExample();
        //Lesson5.main(new String[0]);
    }

    public static void humanExample() {
        Human petr = new Human("Petr");
        Human yuri = new Human("Yuri");
        System.out.println(petr);

        petr.hello();
        Human.hello();
    }

    public static void defenderExample() {
        Dog muhtar = new Dog("Muhtar", 4);
        Robot robot = new Robot();

        Defendable[] defendables = {muhtar, robot};
        for (Defendable defendable : defendables) {
            defendable.defend();
            defendable.attack();
        }
    }


    public static void animalExample() {
        Animal cat = new Cat("Barsik");
        Dog dog = new Dog("Muhtar", 4);
        Animal dog2 = dog;
        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(dog2.getClass());
        if (dog instanceof Animal) {
            System.out.println("Да это животное");
        }

//        cat.makeSound();
//        dog.makeSound();

        Animal[] zoo = {cat, dog};
        for (Animal animal : zoo) {
            if (animal instanceof Dog) {
                ((Dog) animal).defend();
            }
            animal.makeSound();
        }
    }
}
