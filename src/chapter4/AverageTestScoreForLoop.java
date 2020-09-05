package chapter4;
//24 students, 4 tests each

import java.util.Scanner;

public class AverageTestScoreForLoop {
    public static void main(String[] args) {
        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<numberOfStudents; i++){
            int total=0;

            for (int j = 0; j<numberOfTests; j++){
                System.out.println("Enter score #" +(j+1));

                int score = scanner.nextInt();
                total  = score+total;

            }
            int averageScore = total/numberOfTests;
            System.out.println("The average score for student #"+(i+1)+ " is "+averageScore);

        }

    }
}
