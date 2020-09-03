package chapter3;
//User enters grate, print out statement letting them know how they did

import java.util.Scanner;

public class GradeMessagesSwitchStatement {
    public static void main(String[] args) {
        String message;
        //Read their grade in
        System.out.println("Please enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        switch (grade) {
            case "A":
                message = "Awesome";
                break;
            case "B":
                message = "Great job";
                break;

            case "C":
                message = "Try harder";
            default:message = "Please retake the course";
        }
        System.out.println(message);
    }
}
