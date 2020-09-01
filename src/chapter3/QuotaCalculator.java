package chapter3;
/*
All salespeople are expected to make at least 10 sales each week. Those who do receive a congratulatory messg,
those who don't are told how many sales they are short.
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int minSalesRequired = 10;
        System.out.println("Please enter the number of sales made for this week");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();
        scanner.close();
        if (numberOfSales>=minSalesRequired){
            System.out.println("Congratulations, you met the quota for the week");
        }
        else {
            int numberOfSalesShort = minSalesRequired-numberOfSales;
            if (numberOfSalesShort==1) System.out.println("You are " + numberOfSalesShort + " sale short");
            else
            System.out.println("You are "+ numberOfSalesShort + " sales short");
        }
    }
}
