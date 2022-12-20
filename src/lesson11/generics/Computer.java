package lesson11.generics;

public class Computer<T extends Input, V extends Output> {
    private T input;
    private V output;
    public Computer(T input) {
        this.input = input;
    }

    public Computer(T input, V output) {
        this.input = input;
        this.output = output;
    }

    public V getOutput() {
        return output;
    }

    public Computer() {
    }

    public void setOutput(V output) {
        this.output = output;
    }


    public T getInput() {
        return input;
    }

    public void setInput(T input) {
        this.input = input;
    }
}
