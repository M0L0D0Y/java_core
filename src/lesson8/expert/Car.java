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
        try {
            if (price < 0) {
                throw new CarPriceException("Стоимость авто меньше 0");
            }
        } catch (CarPriceException e) {
            System.out.println(e.getMessage());
        }
        if (price > 0) {
            System.out.println(price);
        }
    }
}
