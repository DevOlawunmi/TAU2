package chapter3;
/*
If Statement
Let's say we have a team of salespeople, all of whom make a standard rate of $1,000 a week.
For any of them who make more than 10 sales that week, they get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int rate = 1000;
        int targetSales = 10;
        int bonus = 250;
        System.out.println("Please enter number of sales");
        Scanner scanner = new Scanner(System.in);
         int numberOfSales = scanner.nextInt();
         scanner.close();
         if (numberOfSales>targetSales){
             rate = rate + bonus;
         }
        System.out.println("Your salary is £"+ rate);
    }
}
