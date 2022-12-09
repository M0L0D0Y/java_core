package lesson8.expert;

public class Car {
    private Integer price;

    public Car(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void price() {
        if (price < 0) {
            throw new CarPriceException("Неизвестна мне");
        }
        System.out.println(price);
    }
}
