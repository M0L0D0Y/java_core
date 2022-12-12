package lesson10;

public class Car {
    private double price;
    private Wheel[] wheels = new Wheel[4];
    private Engine engine;

    public Car(double price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void takeMove(Move move) {
        System.out.println("Машина едет за:");
        move.move();
    }

    public static class Wheel {
        private boolean isBroken;

        public Wheel(boolean isBroken) {
            this.isBroken = isBroken;
        }
    }

    public class Engine {
        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }
    }

}
