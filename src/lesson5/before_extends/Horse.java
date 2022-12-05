package lesson5.before_extends;

public class Horse {
    String nickname;

    public Horse(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void makeSound() {
        System.out.println("Лошадь ржет");
    }
}
