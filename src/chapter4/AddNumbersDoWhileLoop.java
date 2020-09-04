package chapter4;
/*
Let's write a program that allows a user to calculate the sum of two numbers as many times as they like to.

For this, we'll use the Do While Loop.

******Just like the While Loop, it's also controlled by a condition.
That condition is tested after the completion of the loop. So, the loop will always run at least once.
So, it's good to use the do while loop when the loop should run at least one time, and based on the situation, they now need to repeat.
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
