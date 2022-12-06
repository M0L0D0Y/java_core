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
    public void fly() throws FlyException{
        if (isInjured) {
            throw new FlyException("Ошибка: утка подстрелена");
        }
        System.out.println("утка летит");
    }
}
