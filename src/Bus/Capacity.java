package Bus;

public enum Capacity {

    ESPECIALLY_SMALL(null, 10),
    SMALL(null, 25),
    MIDDLE(40, 60),
    BIG(60, 80),
    ESPECIALLY_BIG(100, 120);

    private final Integer lowerBound;
    private final Integer upperBound;

    Capacity(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public Integer getUpperBound() {
        return upperBound;
    }
    @Override
    public String toString() {
        String s = "";
        if (getLowerBound() != null) {
            s = s + " от " + String.valueOf(getLowerBound()) + " мест";
        }
        if (getUpperBound() != null) {
            s = s + " до " + String.valueOf(getUpperBound()) + " мест";
        }
        return "Вместимость: " + s;
    }
}
