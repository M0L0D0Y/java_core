package lesson8.advanced;

import java.util.List;

public class Store {
    private List<Worker> workers;

    public Store(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
