package v4;

public class DiscountedAmount {

    private final MonetaryAmount amount;
    private final Percent discount;

    public DiscountedAmount(MonetaryAmount amount, Percent discount) {
        this.amount = amount;
        this.discount = discount;
    }

    public double value() {
        return amount.value() - amount.value() * discount.asDecimal();
    }
}
