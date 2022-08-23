// based on an idea from https://codescracker.com

package v3;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total amount of your shopping: ");
        MonetaryAmount totalAmount = new MonetaryAmount(scan.nextFloat());
        Percent discount;

        if (totalAmount.value() <= 80) {
            discount = new Percent(0);
        } else if (totalAmount.value() > 80 && totalAmount.value() <= 150) {
            discount = new Percent(10);
        } else if (totalAmount.value() > 150 && totalAmount.value() <= 250) {
            discount = new Percent(15);
        } else if (totalAmount.value() > 250 && totalAmount.value() <= 500) {
            discount = new Percent(20);
        } else {
            discount = new Percent(30);
        }

        DiscountedAmount discountedAmount = totalAmount.applyDiscount(discount);

        if (totalAmount.value() <= 80)
            System.out.println("\nYou need to pay " + totalAmount.value());
        else {
            System.out.println("\nCongrats, you've got " + discount.asNominal() + "% discount on the total purchase!");
            System.out.println("You save " + (totalAmount.value() - discountedAmount.value()));
            System.out.println("Now you only need to pay " + discountedAmount.value());
        }
        System.out.println("");
    }

}
