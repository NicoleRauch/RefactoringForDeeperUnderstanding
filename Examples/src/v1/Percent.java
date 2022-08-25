package v1;

public class Percent {
    private final double percentage;

    public Percent(double percentage) {
        this.percentage = percentage;
    }

    double toDecimal() {
        return percentage / 100;
    }

    double toNominal() {
        return percentage;
    }
}
