package chapter4;
/*
so we know that the rate is $15 an hour
and we'll go ahead and say that the max hours they can work is 40
Next, I went ahead and got the unknown variables:

*****Important things to know about a while loop
It’s controlled by a condition and will continue to run while that condition remains true.
The condition is tested before the loop is entered, so there's a chance that this loop will never execute.
It's good to use the While loop when you may or may not need to run the loop, based on the state of the condition.
That's why it's very important to make sure you use your sentinel.
So whatever variable you're using within your condition that controls this loop, make sure that it's getting updated inside of the loop.
 */

import java.util.Scanner;

public class GrossPayValidationWhileLoop {
    public static void main(String[] args) {
        // initialize known variables

        int maxHours = 40;
        int rate = 15;

        // Get the unknown
        System.out.println("Enter how many hours worked");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();
        while (hoursWorked > maxHours||hoursWorked<1) {
            System.out.println("Maximum hours allowed is " + maxHours+ ". Please try again");
            hoursWorked = scanner.nextInt();
        }
        scanner.close();
int totalPay = rate *hoursWorked;
        System.out.println("Your total pay is "+ totalPay);
    }
}