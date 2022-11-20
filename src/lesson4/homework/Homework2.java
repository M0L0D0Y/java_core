package lesson4.homework;

import lesson4.homework.expert.GeneratorExpertHomework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Homework2 {
    public static void main(String[] args) {
        //Базовый
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние пробелы,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        String answer = hi.trim() +
                world.toLowerCase() +
                newLine;
        System.out.println("Базовый.Задача №1");
        System.out.println(answer.repeat(3));


        // Задание №2 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        System.out.println("Базовый.Задача №2");
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a ");
        }
        // Задание №3
        // Создать два класса, которые описывают виды животных (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Например: класс Кот, класс Собака

        /**
         * Смотрите task3
         */

        //Продвинутый
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int count = 0;
        while (result <= 1_000_000) {
            if (increment > 0) {
                result += increment;
                count++;
            } else {
                break;
            }

        }
        System.out.println("\n\nПродвинутый.Задача №1");
        System.out.println(count);


        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // нечетный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] arr = {1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println("\nПродвинутый.Задача №2");
        System.out.println(Arrays.toString(arr));
        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] arr1 = {1, 2, 5, 7, 10};
        int[] arr2 = {2, 3, 2, 17, 15};
        Integer[] arrAnswer = new Integer[arr1.length * 3];
        for (int i = 0; i < arrAnswer.length; i++) {
            if (i < arr1.length) {
                arrAnswer[i] = arr1[i];
            } else if (i < arr2.length * 2) {
                arrAnswer[i] = arr2[i - arr1.length];
            } else if (i < (arr1.length * 3)) {
                arrAnswer[i] = arr1[i - arr1.length * 2] * arr2[i - arr1.length * 2];
            }
        }
        System.out.println("\nПродвинутый.Задача №3");
        System.out.println(Arrays.toString(arrAnswer));


        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String text = "Hello world!";
        String replays = text.replaceAll("l", "r");
        String replaysUpperCase = replays.toUpperCase();
        System.out.println("\nПродвинутый.Задача №4");
        System.out.println(replaysUpperCase.substring(0, 8));

        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами(вывести на экран): начинаются на M
        // и заканчиваются на АВ (русские буквы).
        // Не повторяющиеся
        //Для генерации данных воспользоваться GeneratorExpertHomework.getData()
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
        Set<String> countNumber = new HashSet<>();
        for (Integer key : data.keySet()) {
            Map<String, String[]> interiorData = data.get(key);
            for (String interiorKey : interiorData.keySet()) {
                String[] numbers = interiorData.get(interiorKey);
                for (String number : numbers) {
                    if (number.contains("М") && number.contains("АВ")) {
                        countNumber.add(number);
                    }
                }
            }
        }
        System.out.println("\nЭкспертная");
        System.out.println(countNumber.size());
        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто
    }
}
