package lesson8.advanced;

public class Watch implements Tick {
    private Boolean broken;

    public Watch(Boolean broken) {
        this.broken = broken;
    }

    public Boolean getBroken() {
        return broken;
    }

    public void setBroken(Boolean broken) {
        this.broken = broken;
    }

    @Override
    public void ticks() {
        if (broken) {
            throw new WatchBrokenError("Ошибка: Часы сломались.");
        }
        System.out.println("Часы тикают");

    }
}
