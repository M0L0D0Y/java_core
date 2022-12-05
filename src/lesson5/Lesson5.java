package lesson5;


import lesson5.after_extends.*;

/**
 * Наследование
 */
public class Lesson5 {
    public static void main(String[] args) {
//        Animal horse = new Animal("horse", "Rysak");
//        System.out.println(horse.getName());
//        horse.makeSound();
//
//        Animal cat = new Animal("cat", "Barsik");
//        String name = cat.getName();
//        cat.makeSound();

//        Horse horse = new Horse("Rysak");
//        horse.makeSound();
//
//        Cat cat = new Cat("Barsik");
//        cat.makeSound();

        Horse horse = new Horse("Rysak", 100);
        horse.makeSound();

        Cat cat = new Cat("Barsik");
        cat.makeSound();

        Tiger tiger = new Tiger("Sharhan");
        tiger.makeSound();

        Zoo zoo = new Zoo(horse, tiger, cat);
        System.out.println(zoo);

        System.out.println("12345678".substring(0, 7));

    }
}
