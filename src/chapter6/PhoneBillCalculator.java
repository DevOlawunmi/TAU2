package chapter6;
/*
a phone bill should have an ID, a base cost, a number of allotted minutes and a number of minutes used.
And then, it should also be able to calculate the overage, calculate the tax, and calculate the total
And then, it should also be able to print an itemized bill.
You should also include three constructors
a default one
one that accepts the ID only
one that accepts all fields
Now no matter which of these constructors you use, all fields should be set eventually.
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    int ID;
   static double baseCost;
  static int allottedMinutes;
   static int minutesUsed;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double overage= calculateOverage();
        double tax = calculateTax(overage,baseCost);
      //  calculateAndPrintFinalBill(baseCost,overage,tax);
PhoneBillCalculator phoneBill1 = new PhoneBillCalculator(001,25 );


    }
    public PhoneBillCalculator(){

    }
    public PhoneBillCalculator(int ID){
       this.ID = ID;
    }
    public PhoneBillCalculator(int ID, double baseCost){
        this.ID = ID;
        PhoneBillCalculator.baseCost = baseCost;

    }

    public static double calculateOverage(){
        System.out.println("Enter no of allotted minutes");
         allottedMinutes = scanner.nextInt();
        double rate = 0.25;
        System.out.println("Enter number of minutes used");
       minutesUsed= scanner.nextInt();
        int overageMinutes = minutesUsed-allottedMinutes;
        double overageCost = rate*overageMinutes;
        return overageCost;
    }

    public static double calculateTax(double overage, double baseCost){
        double rate  = 0.15;
        double tax = rate *(overage+baseCost);
        return tax;

    }
    public static void calculateAndPrintFinalBill(double baseCost, double overage, double tax){
        double finalTotal = baseCost+overage+tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));



    }
public static void calculateAndPrintBill(PhoneBillCalculator phoneBillCalculator){

}

}
