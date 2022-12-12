package lesson9;

public class Car {
    private double price;
    private String model;
    private double mileage;

    public Car(double price, String model, double mileage) {
        this.price = price;
        this.model = model;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
