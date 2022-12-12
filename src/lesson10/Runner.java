package lesson10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Car.Wheel wheel = new Car.Wheel(true);
        Car car = new Car(20_000d);
        Car.Engine engine = car.new Engine(5.0);

//
        List<Integer> integers = List.of(1, 2, 3, 4);
//        integers.stream().map((e) -> e * 3);
//
        Move human = new Move() {
            @Override
            public void move() {
                System.out.println("Человек идет");
            }
        };
//
//        Move airplane = new Move() {
//            @Override
//            public void move() {
//                System.out.println("Самолет летит");
//            }
//        };
//
//        human.move();
//        Move[] moves = {human, airplane};
//        car.takeMove(human);
//        car.takeMove(airplane);

//        AbstractCar car1 = new AbstractCar() {
//            @Override
//            public void start() {
//
//            }
//
//            @Override
//            public void stop() {
//
//            }
//        };
//        AbstractCar car2 = new AbstractCar() {};
//        AbstractCar car3 = new AbstractCar() {};
//        AbstractCar car4 = new AbstractCar() {};
//        car1.go();

        String result = StringUtilClass.getFirstLetterFromName("Юрий");
        System.out.println(result);
        LocalDate first = LocalDate.now();
        LocalDate second = LocalDate.now().plus(30, ChronoUnit.DAYS);
        System.out.println(isSecondDateAfterFirstDate(first, second));

    }

    public static boolean isSecondDateAfterFirstDate(LocalDate first, LocalDate second) {
        if (first != null && second != null) {
            return second.isAfter(first);
        }
        throw new RuntimeException("Одна из дат = null");
    }
}
