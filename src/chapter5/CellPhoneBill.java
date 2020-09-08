package chapter5;

import java.util.Scanner;
/*
So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
 And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
 Create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 Enter base cost of the plan:
82.45
Enter overage minutes:
9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41

 */
public class CellPhoneBill {
    static double base;

    public static void main(String[] args) {

        System.out.println("Enter base cost of plan:");
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextDouble();
        System.out.println("Enter number of overage minutes");
        int overageMinutes = scanner.nextInt();
        scanner.close();

        double overage = calculateOverageCost(overageMinutes);
        double subTotal = calculateSubtotal(overage);
        double tax = calculateTax(subTotal);
       double finalBill =  calculateFinalBill(tax,subTotal);
       // System.out.println("You total bill is " + finalBill );
        calculateAndPrintBill(base,overage,tax);

    }
    public static double calculateOverageCost(int overageMinutes){
        double rate = 0.25;
        double overage = rate*overageMinutes;
        return overage;

    }
    public static double calculateSubtotal(double overageTotal){
        return overageTotal+ base;
    }

    public static double calculateTax(double subTotal){
        double taxRate  = 0.15;
        double tax = taxRate*subTotal;
        return tax;
    }

    public static double calculateFinalBill(double tax, double subTotal){
        double finalBill = tax+subTotal;
        return finalBill;
    }
    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }


}
