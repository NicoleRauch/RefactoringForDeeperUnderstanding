package src_2;

public class DiscountedAmount {

    private double discountedAmount;

    public DiscountedAmount(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Negative values are not allowed for discounted amounts");
        }
        this.discountedAmount = amount;
    }

    public double value() {
        return discountedAmount;
    }
}
