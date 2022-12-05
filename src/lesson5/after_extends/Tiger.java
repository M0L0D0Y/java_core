package lesson5.after_extends;

public class Tiger extends Cat {

    public Tiger(String nickname) {
        super(nickname);
    }

    @Override
    public void makeSound() {
        System.out.println("Тигр рычит");
    }


}
