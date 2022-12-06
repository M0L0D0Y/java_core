package lesson8.base;

public class Airplane implements Fly {
    private Integer countPassengers;

    public Airplane(Integer countPassengers) {
        this.countPassengers = countPassengers;
    }

    public Integer getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(Integer countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
            System.out.println("самолет летит");
    }
}
