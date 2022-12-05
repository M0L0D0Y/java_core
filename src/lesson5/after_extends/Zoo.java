package lesson5.after_extends;

public class Zoo {
    Horse horse;
    Tiger tiger;
    Cat cat;

    public Zoo(Horse horse, Tiger tiger, Cat cat) {
        this.horse = horse;
        this.tiger = tiger;
        this.cat = cat;
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "horse=" + horse +
                ", tiger=" + tiger +
                ", cat=" + cat +
                '}';
    }
}
