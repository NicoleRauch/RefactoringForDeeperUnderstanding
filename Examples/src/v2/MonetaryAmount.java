package v2;

public class MonetaryAmount {
    private final double amount;

    public MonetaryAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative values are not allowed for monetary amounts");
        }
        this.amount = amount;
    }

    public double value() {
        return amount;
    }
}
