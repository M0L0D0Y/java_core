package lesson6;

import lesson6.homework.advanced.task1.interfaces.Blossom;
import lesson6.homework.advanced.task1.interfaces.Smell;
import lesson6.homework.advanced.task1.model.Fern;
import lesson6.homework.advanced.task1.model.Pine;
import lesson6.homework.advanced.task1.model.Rose;
import lesson6.homework.advanced.task1.model.Spruce;
import lesson6.homework.advanced.task2.model.Stock;
import lesson6.homework.advanced.task2.model.Worker;
import lesson6.homework.base.task2.Car;
import lesson6.homework.base.task2.Car1;
import lesson6.homework.base.task2.Car2;
import lesson6.homework.expert.Human;

import javax.swing.*;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) {
        //Базовый уровень
        // Задание №1
        // Создать следующие классы
        // 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
        // подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)
        // 2. Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера")
        // 3. LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
        // Метод work у компьютера выводит в консоль "выполняет вычисления".
        //Подумать какие классы и методы являются абстрактными, к каким методам нужна надпись @Override
        /**Смотри в package lesson6.homework.base.task1*/

        //Задание №2
        //Создать два класса машин, создать 4 экземпляра и положить их в один массив
        Car ca1 = new Car1("car1");
        Car car2 = new Car2("car2");
        Car car3 = new Car1("car3");
        Car car4 = new Car2("car4");
        Car[] cars = {ca1, car2, car3, car4};
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        Pine pine = new Pine("шишки");
        Spruce spruce = new Spruce("шишки");
        Rose rose = new Rose();
        Fern fern = new Fern();
        Smell[] smells = {pine, spruce, rose};
        Blossom[] blossoms = {rose, fern};
        // И у каждого массива вызвать характерный метод
        System.out.println("Продвинутый уровень. Задача №1");
        for (Smell smell : smells) {
            smell.smell();
        }
        for (Blossom blossom : blossoms) {
            blossom.blossom();
        }
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести

        // Задание №2:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        System.out.println("\nПродвинутый уровень. Задача №2");
        Worker worker1 = new Worker("worker1");
        Worker worker2 = new Worker("worker2");
        Worker worker3 = new Worker("worker3");
        List<Worker> workers = List.of(worker1, worker2, worker3);
        Stock stock = new Stock();
        stock.setWorkers(workers);
        stock.setCountVodka(100);
        for (Worker worker : workers) {
            worker.messUpVodka(stock);
            System.out.println(worker.getName() + " испортил " + worker.getCountBadVodka() + " водки");
            System.out.println("Осталось не испорченной водки " + stock.getCountVodka());
        }
        //Экспертный уровень:
        //Задача №1
        // Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
        // Для этого шаблона характерно:
        // 1. приватный конструктор,
        // 2. вложенный статический класс (HumanBuilder)
        // 3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
        // Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
        // 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
        // которые вызывают сеттеры у экземпляра класса Human.
        // 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
        // Ожидаемый результат
        // Human human = Human.builder().name("Петр").age(20).weight(80).build();
        // human.info()
        // Петр - возраст 20, вес 80
        System.out.println("\nЭкспертный уровень");
        Human human = Human.builder().name("Петр").age(20).weight(80).build();
        human.info();
    }
}