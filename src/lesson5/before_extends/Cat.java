package lesson5.before_extends;

public class Cat {
    String nickname;

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void makeSound() {
        System.out.println("Кот мяукает");
    }
}
