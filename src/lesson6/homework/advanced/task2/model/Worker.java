package lesson6.homework.advanced.task2.model;

public class Worker {
    private String name;
    private Integer countBadVodka = 0;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountBadVodka() {
        return countBadVodka;
    }

    public void setCountBadVodka(Integer countBadVodka) {
        this.countBadVodka = countBadVodka;
    }

    public void messUpVodka(Stock stock) {
        if (stock.getWorkers() == null) {
            System.out.println("Недостаточно работников. Невозможно испортить водку");
        } else {
            System.out.println("Ура я испортил водку!");
            countBadVodka++;
        }
    }
}
