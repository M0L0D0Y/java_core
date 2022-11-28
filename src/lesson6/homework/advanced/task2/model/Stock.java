package lesson6.homework.advanced.task2.model;

import java.util.List;

public class Stock {
    private Integer countVodka;
    private List<Worker> workers;

    public Integer getCountVodka() {
        return countVodka - getBadVodka();
    }

    public void setCountVodka(Integer countVodka) {
        this.countVodka = countVodka;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        int COUNT_MIN_WORKER = 3;
        if (workers.size() < COUNT_MIN_WORKER) {
            System.out.println("Должно быть минимум " + COUNT_MIN_WORKER + " работника");
            this.workers = null;
        } else {
            this.workers = workers;
        }
    }

    private int getBadVodka() {
        int badVodka = 0;
        if (workers != null) {
            for (Worker worker : workers) {
                if (worker.getCountBadVodka() != 0) {
                    badVodka = badVodka + worker.getCountBadVodka();
                }
            }
        }
        return badVodka;
    }
}
