package Truck;

public enum Tonnage {

    TONNAGE_N1(null, 3.5f),
    TONNAGE_N2(3.5f, 12f),
    TONNAGE_N3(12f, null);

    private final Float lowerBound;
    private final Float upperBound;

    Tonnage(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Float getLowerBound() {
        return lowerBound;
    }

    public Float getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        String s = "";
        if (getLowerBound() != null) {
            s = s + " от " + String.valueOf(getLowerBound()) + " тонн";
        }
        if (getUpperBound() != null) {
            s = s + " до " + String.valueOf(getUpperBound()) + " тонн";
        }
        return "Грузоподъемность: " + s;
    }
}
