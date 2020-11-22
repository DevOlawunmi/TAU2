package chapter3;
/*
More than one condition to be met

To qualify for a loan there are two conditions that must be met.
The person must make at least $30,000 and they must have also been at their job for 2 or more years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        // initialise what we know
        int minSalaryToQualify = 30000;
        int minYearsToQualify = 2;

        // get info we don't know
        System.out.println("How much is your current salary?");
        Scanner scanner = new Scanner(System.in);
        double currentSalary = scanner.nextDouble();
        System.out.println("How many years have you been with your current employer?");
        double noOfYears = scanner.nextDouble();
        scanner.close();
        if (currentSalary >= minSalaryToQualify) {
            if (noOfYears >= minYearsToQualify) {
                System.out.println("You qualify for the loan");
            }
            else {
                System.out.println("You do not qualify for the loan due to the number of years");
            }
       }else {
            System.out.println("You do not qualify due to your salary");
        }

    }
}
