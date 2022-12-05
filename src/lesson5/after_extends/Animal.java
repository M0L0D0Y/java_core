package lesson5.after_extends;

/**
 * Абстрактный класс не может быть создан (new Animal())
 */
public abstract class Animal extends Object {
    String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    /**
     * Абстрактный метод не имеет реализации, и должен быть реализован в реальном классе наследнике
     */
    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
