package lesson2.homework;

public class Homework1 {

    public static void main(String[] args) {
        //Базовая домашка
        //Задача №1
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.00202130120
        taskOne();
        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка,
        // отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад,
        // если до 11 лет в младшую школу,
        // если до 17 лет в среднюю школу,
        // иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел в сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        System.out.println(taskTwo(ageChildren));
        // Задание №3
        // Дано:

        //Курица
        boolean chicken = false;
        //Овощи
        boolean vegetables = false;
        //Соус
        boolean sour = true;
        //Хлеб
        boolean toast = true;
        //Колбаса
        boolean sausage = false;
        //Яйца
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному).
        // Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        System.out.println(taskThree(chicken, vegetables, sour, toast, sausage, eggs));
        //Продвинутая
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        System.out.println(taskFour("234", "some_text"));
        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        System.out.println(taskFive(3, 5));
        // Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        System.out.println(taskSix(hasFuel, hasElectricsProblem, hasMotorProblem,
                hasTransmissionProblem, hasWheelsProblem));//В условии не сказано 2 или более поломок.

    }


    public static void taskOne() {
        double weigth = 70;
        double height = 1.70;
        double index = weigth / (height * height);
        System.out.println(index);
    }

    public static String taskTwo(int ageChildren) {
        if (ageChildren < 6) {
            return "пошел в сад";
        }
        if (ageChildren < 11) {
            return "пошел в младшую школу";
        }
        if (ageChildren < 17) {
            return "пошел в среднюю школу";
        }
        return "пошел в университет";
    }

    public static String taskThree(boolean chicken, boolean vegetables, boolean sour,
                                   boolean toas, boolean sausage, boolean eggs) {
        if (chicken && vegetables && sour && toas) {
            return "Цезарь";
        }
        if (vegetables && sausage || chicken && eggs) {
            return "Оливье";
        }
        if (vegetables) {
            return "Овощной салат";
        }
        return "У меня ничего нет";
    }

    public static int taskFour(String num, String someText) {
        int number = 0;
        try {
            number = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
        int var = someText.length();
        return number + var;
    }

    public static double taskFive(int a, int b) {
        return Math.pow((a + b), 2);
    }

    public static double taskSix(boolean hasFuel, boolean hasElectricsProblem, boolean hasMotorProblem,
                                 boolean hasTransmissionProblem, boolean hasWheelsProblem) {
        int checkConsultation = 0;
        int checkMotorProblem = 0;
        int checkElectricsProblem = 0;
        int checkTransmissionProblem = 0;
        int checkWheelsProblem = 0;
        int discountMin = 10;
        int discountMax = 20;
        int countProblem = 0;
        if (hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            checkConsultation = 1000;
        }
        if (hasMotorProblem) {
            checkMotorProblem = 10_000;
            countProblem++;
        }
        if (hasElectricsProblem) {
            checkElectricsProblem = 5000;
            countProblem++;
        }
        if (hasTransmissionProblem) {
            checkTransmissionProblem = 4000;
            countProblem++;
        }
        if (hasWheelsProblem) {
            checkWheelsProblem = 2000;
            countProblem++;
        }
        double check;
        check = (checkConsultation + checkElectricsProblem +
                checkMotorProblem + checkTransmissionProblem + checkWheelsProblem);
        if (countProblem == 2) {//В условии не сказано 2 или более поломок.
            double sumDiscount = check / 100 * discountMin;
            check = check - sumDiscount;
        }
        if (checkTransmissionProblem > 0 && (checkElectricsProblem > 0 || checkMotorProblem > 0)) {
            double sumDiscount = check / 100 * discountMax;
            check = check - sumDiscount;
        }
        return check;
    }
}
