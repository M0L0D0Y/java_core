package lesson11.generics;

public class Runner {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Computer<KeyBoard, Monitor> computer = new Computer<>(keyBoard);
        KeyBoard input = computer.getInput();
        input.exit();

        Computer<KeyBoard, Tv> keyBoardComputer = new Computer<>();
        keyBoardComputer.setInput(keyBoard);

        Computer<Mouse, Monitor> mouseComputer = new Computer<>();
        mouseComputer.getInput().scroll();

        keyBoardComputer.getOutput().soundOff();

        Computer[] computers = {keyBoardComputer, mouseComputer};



    }
}
