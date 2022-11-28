package lesson6.homework.advanced.task1.model;

public abstract class Wood {
    private String cones;

    public Wood(String cones) {
        this.cones = cones;
    }

    public String getCones() {
        return cones;
    }

    public void setCones(String cones) {
        this.cones = cones;
    }

}
