package lesson8.base;

public class Duck implements Fly {
    private Boolean isInjured;

    public Duck(Boolean isInjured) {
        this.isInjured = isInjured;
    }

    public Boolean getInjured() {
        return isInjured;
    }

    public void setInjured(Boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() {
        try {
            if (isInjured) {
                throw new FlyException("Ошибка: утка подстрелена");
            }
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
        if (!isInjured) {
            System.out.println("утка летит");
        }
    }
}
