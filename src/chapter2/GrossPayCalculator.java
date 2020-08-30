package chapter2;
// Let's say we need to calculate an employee's gross pay.

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

//get the number of hours worked.
        System.out.println("Please enter number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

//Then, we get the hourly pay rate.
        System.out.println("Please enter hourly rate");
      int hourlyPay =  scanner.nextInt();
      scanner.close();

//Next, we multiply the hours and the pay rate.
        int grossPay = hourlyPay * hoursWorked;
//Finally, we would display the result.
        System.out.println("Your gross pay is £" + grossPay);
    }
}
