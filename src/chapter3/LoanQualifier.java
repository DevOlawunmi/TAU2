package chapter3;
/*
To qualify for a loan there are two conditions that must be met.
The person must make at least $30,000 and they must have also been at their job for 2 or more years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int minSalaryToQualify = 30000;
        int minYearsToQualify = 2;
        System.out.println("How much is your current salary?");
        Scanner scanner = new Scanner(System.in);
        int currentSalary = scanner.nextInt();
        System.out.println("How many years have you been on this job?");
        int noOfYears = scanner.nextInt();
        scanner.close();
        if (currentSalary >= minSalaryToQualify) {
            if (noOfYears >= minYearsToQualify) {
                System.out.println("You qualify for the loan");
            } else {
                System.out.println("You do not qualify for the loan due to the number of years");
            }
        } else {
            System.out.println("You do not qualify due to your salary");
        }

    }
}
