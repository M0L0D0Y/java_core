package lesson8.advanced;

public class Brand {
    private Store[] stores;

    public Brand(Store[] stores) {
        this.stores = stores;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }
}
