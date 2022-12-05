package lesson8.expert;

public class CarShop {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarShop(Car car) {
        this.car = car;
    }

    public void sellCar() {
        if (car.getPrice() >= 5000) {
            System.out.println("Здравствуй клиент, цена этого авто");
            car.price();
            System.out.println("Хочешь купить авто?\n");
        }
        if (car.getPrice() < 0) {
            System.out.println("""
                    Здравствуй клиент, цена этого авто
                    Неизвестна мне
                    Давайте посмотрим другое авто?
                    """);
        }
    }
}
