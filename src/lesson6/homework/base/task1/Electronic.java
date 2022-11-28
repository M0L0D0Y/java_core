package lesson6.homework.base.task1;

public abstract class Electronic {
    private Boolean flag;

    public Electronic(Boolean flag) {
        this.flag = flag;
    }

    public void on() {
        setFlag(true);
    }

    public void off() {
        setFlag(false);
    }

   public abstract void work();

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
