package chapter5;

import java.util.Scanner;

/*
So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
 And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
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
    static Scanner scanner = new Scanner(System.in);
    static int overageMinutes;
    static int tax = 15;
    static double subTotal = 0;
    static double totalTax;
    public static void main(String[] args) {
        System.out.println("Enter the cost plan:");
        double plan = scanner.nextDouble();
        System.out.println("Enter overage minutes");
        overageMinutes = scanner.nextInt();
        scanner.close();
       double overageCharge =  calculateOverages(overageMinutes);
       double totalTax = calculateTax(subTotal);
        System.out.println(finalBill(subTotal,totalTax));


    }
    public static double calculateOverages(int extraMinutes){
        int overageCostPerMinute = 25;
        double overage = overageCostPerMinute*extraMinutes;
        return overage;
    }


    public static double calculateTax( double subTotal){
        totalTax = tax*subTotal;
        return totalTax;

    }
     public static double finalBill(double totalBill, double totalTax ){
        double finalBill = totalBill+ totalTax;
        return finalBill;
     }

}
