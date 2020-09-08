package chapter5;

import java.util.Scanner;

/*   * VARIABLE SCOPE
        * Write an 'instant credit check' program that approves
        * anyone who makes more than $25,000 and has a credit score
        * of 700 or better. Reject all others.
        * Steps: Ask user what they earn and their credit score and read it in
        * Check if both conditions are met
        * Output result
        */
public class CreditCheckAttempt2 {

    static Scanner scanner = new Scanner(System.in);
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;


    public static void main(String[] args) {
        int creditScore = getCreditScore();// call the getCreditScore method, save the value in the creditScore var
        double salary = getSalary(); // call the getSalary method and save the value it returns in the salary var
        scanner.close();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
        /*
        we save these values because we are going to pass them as arguments in the main method
         */

    }

    public static double getSalary() {
        System.out.println("Enter salary:");
        double salary = scanner.nextInt();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else return false;
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("You qualify");
        } else System.out.println("You do not qualify");

    }
}