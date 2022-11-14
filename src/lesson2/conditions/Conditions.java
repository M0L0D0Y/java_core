package lesson2.conditions;

public class Conditions {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        boolean result = x > y;

        // '==' - сравнение (равны или нет), '!=' - значения не одинаковы
        // '>' - больше, '<' - меньше, '>=' - больше или равно, '<=' - меньше или равно
        if (true) {
            System.out.println("Х больше У");
        } else if (x == y) {
            System.out.println("Х равен Y");
        } else if (x > 100) {

        } else {
            System.out.println("Х не меньше У");
        }

        //Сын купи молоко и хлеб
        boolean isMilkBought = false;
        boolean isBreadBought = false;
        //Логическое "И"(AND) - если два значение true, то тогда true, иначе false
        boolean resultForMom = isMilkBought && isBreadBought;
//        boolean resultForMom = true && true;
//        boolean resultForMom = true;

//        boolean resultForMom = false && true;
//        boolean resultForMom = false;

        if (resultForMom) {
            System.out.println("Мальчик купил хлеб и молоко");
        } else if (isMilkBought) {
            System.out.println("Мальчик не купил хлеб");
        } else if (isBreadBought) {
            System.out.println("Мальчик не купил молоко");
        } else {
            System.out.println("Мальчик не купил хлеб или молоко или и то не другое");
        }

        //Мама сказала купи или хлеб или молоко, а можно и то и то
        //Логическое или(OR) - если хотя бы одно значение true, тогда true, иначе false
        boolean resultForMamOr = isMilkBought || isBreadBought;
//        boolean resultForMamOr = true || true;
//        boolean resultForMamOr = true;

//        boolean resultForMamOr = false || true;
//        boolean resultForMamOr = true;

//        boolean resultForMamOr = false || false;
//        boolean resultForMamOr = false;

        //Сынок, купи хлеб и что то из сладости - например шоколад или конфеты
        boolean isBreadBought2 = false;
        boolean isChocolateBought = false;
        boolean isCandyBought = true;
        boolean resultForMomAll = isBreadBought2 && (isChocolateBought || isCandyBought);
//        boolean resultForMomAll = false && (true);
//        boolean resultForMomAll = false;

//        boolean resultForMomAll = false || true;
//        boolean resultForMomAll = true;
    }
}
