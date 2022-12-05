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
        try {
            if (broken) {
                throw new WatchBrokenError("Ошибка: Часы сломались.");
            }
        } catch (WatchBrokenError e) {
            System.out.println(e.getMessage());
        }
        if (!broken) {
            System.out.println("Часы тикают");
        }
    }
}
