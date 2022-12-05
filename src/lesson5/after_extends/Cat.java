package lesson5.after_extends;

public class Cat extends Animal {

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void makeSound() {
        System.out.println("Кот мяукает");
    }

    /**
     * Метод нельзя переопределить
     */
    public final void catHunt() {
        System.out.println("кот охотится");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
