package lesson6.homework.expert;

//атрибуты - возраст, имя, вес. Метод: инфо о человеке
public class Human {
    private Integer age;
    private String name;
    private Integer weight;

    private Human() {
    }

    public static class HumanBuilder {
        private static final Human human = new Human();

        public HumanBuilder age(Integer age) {
            human.setAge(age);
            return this;
        }

        public HumanBuilder name(String name) {
            human.setName(name);
            return this;
        }

        public HumanBuilder weight(Integer weight) {
            human.setWeight(weight);
            return this;
        }

        public Human build() {
            return human;
        }
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.println(name + " - возраст " + age + ", вес " + weight);
    }
}
