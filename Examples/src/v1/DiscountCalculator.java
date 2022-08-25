// based on an idea from https://codescracker.com

package v1;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total amount of your shopping: ");
        double totalAmount = scan.nextFloat();

        System.out.println(calculateTotalPrice(new MonetaryAmount(totalAmount)));
    }

    public static String calculateTotalPrice(MonetaryAmount monetaryAmount) {
        Percent percentage;

        if (monetaryAmount.amount() <= 80) {
            percentage = new Percent(0);
        } else if (monetaryAmount.amount() > 80 && monetaryAmount.amount() <= 150) {
            percentage = new Percent(10);
        } else if (monetaryAmount.amount() > 150 && monetaryAmount.amount() <= 250) {
            percentage = new Percent(15);
        } else if (monetaryAmount.amount() > 250 && monetaryAmount.amount() <= 500) {
            percentage = new Percent(20);
        } else {
            percentage = new Percent(30);
        }

        DiscountedAmount discount = monetaryAmount.calcDiscount(percentage);

        if (monetaryAmount.amount() <= 80)
            return "You need to pay " + monetaryAmount.amount();
        else {
            return "Congrats, you've got " + percentage.toNominal() + "% discount on the total purchase!"
                + "\nYou save " + (monetaryAmount.amount() - discount.amount())
                + "\nNow you only need to pay " + discount.amount();
        }
    }

}
