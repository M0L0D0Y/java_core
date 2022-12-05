package lesson5.after_extends;


/**
 * Класс Horse финализирован, значит от него нельзя наследоваться
 **/
public final class Horse extends Animal {
    int weight;

    public Horse(String nickname, int weight) {
        super(nickname);
        this.weight = weight;
    }

    public void printName() {
        System.out.println(super.getNickname());
    }

    @Override
    public void makeSound() {
        System.out.println("Лошадь ржет");
    }
}
