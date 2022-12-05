package lesson7;

public enum Country {
    RUSSIA(140),
    FRANCE(70),
    ITALY(80),
    SOUTH_KOREA(60);
    private long countPeoples;

    Country(long countPeoples) {
        this.countPeoples = countPeoples;
    }

    public long getCountPeoples() {
        return countPeoples;
    }


}
