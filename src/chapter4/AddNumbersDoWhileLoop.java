package chapter4;
/*
Let's write a program that allows a user to calculate the sum of two numbers as many times as they like to.

For this, we'll use the Do While Loop.
 */

import java.util.Scanner;

public class AddNumbersDoWhileLoop {
    public static void main(String[] args) {
        boolean go;
        do {
            System.out.println("Enter the first number");

            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            System.out.println("Enter the second number");
            int number2 = scanner.nextInt();
            int total  = number1+number2;
            System.out.println("The total is "+ total);
            System.out.println("Would you like to have another go?");
            go = scanner.nextBoolean();
        }
        while (go);
    }
}
