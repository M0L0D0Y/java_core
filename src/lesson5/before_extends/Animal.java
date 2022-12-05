package lesson5.before_extends;

public class Animal {
    String name;
    String nickname;

    public Animal(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return this.name;
    }

    public void makeSound() {
        if (this.name.equals("horse")) {
            System.out.println("Лошадь ржет");
        } else if (this.name.equals("cat")) {
            System.out.println("Кот мяукает");
        }
    }
}
