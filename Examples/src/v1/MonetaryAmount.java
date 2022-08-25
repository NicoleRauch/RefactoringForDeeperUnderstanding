package v1;

public record MonetaryAmount(double amount) {
    public DiscountedAmount calcDiscount(Percent percent) {

        return new DiscountedAmount(amount - amount * percent.toDecimal());
    }
}
