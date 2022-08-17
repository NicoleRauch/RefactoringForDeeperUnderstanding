// based on an idea from https://codescracker.com

package src_1;

import java.util.Scanner;

public class DiscountCalculator
{
    public static double calcDiscount(double amount, double percentage) {
        return amount * percentage/100;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total amount of your shopping: ");
        double totalCost = scan.nextFloat();
        double percentage;

        if(totalCost<=80) {
            percentage = 0;
        } else if(totalCost>80 && totalCost<=150) {
            percentage = 10;
        }
        else if(totalCost>150 && totalCost<=250) {
            percentage = 15;
        } else if(totalCost>250 && totalCost<=500) {
            percentage = 20;
        } else {
            percentage = 30;
        }

        double discount = calcDiscount(totalCost, percentage);

        if(totalCost<=80)
            System.out.println("\nYou need to pay " + totalCost);
        else {
            System.out.println("\nCongrats, you've got "+ percentage +"% discount on the total purchase!");
            System.out.println("You save " + discount);
            System.out.println("Now you only need to pay " + (totalCost - discount));
        }
        System.out.println("");
    }

}
