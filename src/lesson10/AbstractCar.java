package lesson10;

public abstract class AbstractCar {
    private Boolean state = true;
    private boolean state2;

    public void go() {
        System.out.println("Машина едет");
    }

    public abstract void stop();
    public abstract void start();
}
