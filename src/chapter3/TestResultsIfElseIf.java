package chapter3;
/*
Display a letter grade for students based on their score
 */

import java.util.Scanner;

public class TestResultsIfElseIf {
    public static void main(String[] args) {
        System.out.println("Please enter your score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        char grade;
        if (score < 40) {grade = 'F';}
        else if (score < 50) {grade = 'E';}
        else if (score < 60) {grade = 'C';}
        else if (score < 70) {grade = 'B';}
        else {grade = 'A';}

            System.out.println("Your grade is "+ grade);
        }
    }

