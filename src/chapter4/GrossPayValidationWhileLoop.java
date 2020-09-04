package chapter4;
/*
so we know that the rate is $15 an hour
and we'll go ahead and say that the max hours they can work is 40
Next, I went ahead and got the unknown variables:

I asked them how many hours they worked that week
and scanned it in
Now, since we are not to allow overtime, we have to verify that what they've entered is valid input
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