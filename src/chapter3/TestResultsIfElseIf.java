package chapter3;
/*
The if-else-if statement is used when there are more than two possible paths.
For example, if situation A occurs, let's go down one path; else, if situation B occurs, let's go down another path;
else, if situation C occurs, let's go down a different path.


Display a letter grade for students based on their score
 */

import java.util.Scanner;

public class TestResultsIfElseIf {
    public static void main(String[] args) {
        System.out.println("Please enter your score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        // the char data type uses single quotes

        char grade;
        if (score < 40) {grade = 'F';}
        else if (score < 50) {grade = 'E';}
        else if (score < 60) {grade = 'C';}
        else if (score < 70) {grade = 'B';}
        else {grade = 'A';}

            System.out.println("Your grade is "+ grade);
        }
    }

