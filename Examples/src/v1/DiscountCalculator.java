// based on an idea from https://codescracker.com

package v1;

import java.util.Scanner;

public class DiscountCalculator {
    public static double calcDiscount(MonetaryAmount monetaryAmount, Percent percent) {

        return monetaryAmount.amount() - monetaryAmount.amount() * percent.getPercentage() / 100;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total amount of your shopping: ");
        double totalAmount = scan.nextFloat();

        System.out.println(calculateTotalPrice(new MonetaryAmount(totalAmount)));
    }

    public static String calculateTotalPrice(MonetaryAmount monetaryAmount) {
        double percentage;

        if (monetaryAmount.amount() <= 80) {
            percentage = 0;
        } else if (monetaryAmount.amount() > 80 && monetaryAmount.amount() <= 150) {
            percentage = 10;
        } else if (monetaryAmount.amount() > 150 && monetaryAmount.amount() <= 250) {
            percentage = 15;
        } else if (monetaryAmount.amount() > 250 && monetaryAmount.amount() <= 500) {
            percentage = 20;
        } else {
            percentage = 30;
        }

        double discount = calcDiscount(monetaryAmount, new Percent(percentage));

        if (monetaryAmount.amount() <= 80)
            return "You need to pay " + monetaryAmount.amount();
        else {
            return "Congrats, you've got " + percentage + "% discount on the total purchase!"
                + "\nYou save " + (monetaryAmount.amount() - discount)
                + "\nNow you only need to pay " + discount;
        }
    }
}
