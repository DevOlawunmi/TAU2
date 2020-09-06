package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 * Steps: Ask user what they earn and their credit score and read it in
 * Check if both conditions are met
 * Output result
 */
public class CreditCheck {
    static Scanner scanner = new Scanner(System.in);
    static int requiredCredit = 700;
    static int minSalary = 25000;

    public static void main(String[] args) {
        int salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
       boolean qualified =  isUserQualified(salary,creditScore);
       notifyUser(qualified);

    }

    public static int getSalary() {
        System.out.println("Enter your salary");
        int salary = scanner.nextInt();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int salary, int creditScore) {
        return creditScore >= requiredCredit && salary >= minSalary;
    }
    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congratulations");
        } else System.out.println("Sorry you don't qualify");

    }
}
