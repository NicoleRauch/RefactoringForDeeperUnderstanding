package src_2;

public class MonetaryAmount {
    private double amount;

    public MonetaryAmount(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Negative values are not allowed for monetary amounts");
        }
        this.amount = amount;
    }

    public double value() {
        return amount;
    }
}
