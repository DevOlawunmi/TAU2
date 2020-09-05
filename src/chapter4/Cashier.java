package chapter4;
/*
Write a prog that will scan a number of items and tally the cost
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("How many items would you like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;
        for (int i = 0; i<quantity; i++){
            System.out.println("Enter the cost of item");
            double cost = scanner.nextDouble();
            total = cost + total;
        }
        scanner.close();
        System.out.println("Your total is "+ total);
    }
}
