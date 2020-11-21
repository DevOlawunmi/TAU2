package chapter3;
/*
If Statement
Let's say we have a team of salespeople, all of whom make a standard rate of $1,000 a week.
For any of them who make more than 10 sales that week, they get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // initialise the known values
        int salary = 1000;
        int targetSales = 10;
        int bonus = 250;
        // get info I don't know
        System.out.println("Please enter number of sales");
        Scanner scanner = new Scanner(System.in);
         int numberOfSales = scanner.nextInt(); // read the data in and store it in a variable called numberOfSales.
         scanner.close();

         //check the conditions and do my calculations. The condition must resolve into a boolean value(true (0) or false (1))
         if (numberOfSales>targetSales){
             salary = salary + bonus;
         }
        System.out.println("Your salary is £"+ salary);
    }
}
