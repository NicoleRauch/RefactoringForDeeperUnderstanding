package v2;

public class Percent {
    private final double percent;

    public Percent(double percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Negative percentages are not allowed!");
        }
        this.percent = percent;
    }

    public double value() {
        return percent;
    }
}
