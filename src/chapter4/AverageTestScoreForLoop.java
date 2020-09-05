package chapter4;
//24 students, 4 tests each

public class AverageTestScoreForLoop {
    public static void main(String[] args) {
        int numberOfStudents = 24;
        int numberOfTests = 4;
        for (int i = 0; i<numberOfStudents; i++){

            for (int j = 0; j<numberOfTests; j++){
                System.out.println("Enter score #" +(j+1));
            }
        }

    }
}
