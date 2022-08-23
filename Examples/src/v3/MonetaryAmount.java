package v3;

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

    public DiscountedAmount applyDiscount(Percent discount) {
        return new DiscountedAmount(amount - amount * discount.asDecimal());
    }
}
