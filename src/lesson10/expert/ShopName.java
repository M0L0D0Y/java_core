package lesson10.expert;

public enum ShopName {
    YDOMA(0),
    OKEY(1),
    PYTEROCHKA(2),
    PEREKRESTOK(3);
    private final int index;

    ShopName(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
