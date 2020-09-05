package chapter4;
/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class DieRollAssignment {
    public static void main(String[] args) {
        int noOfRolls = 5;
        int maxNoOfSpaces =20;
        int currentSpace = 0;
        int remainingSpaces;
        for (int i = 0; i<noOfRolls||currentSpace==maxNoOfSpaces; i++){
            Random random = new Random();
           int die = random.nextInt(5)+1;
           currentSpace = die+currentSpace;
           remainingSpaces = maxNoOfSpaces-currentSpace;
            System.out.println("You have rolled "+ die+ ". You are now on "+ currentSpace+ ". You have "+ remainingSpaces+ "spaces left");
            if (currentSpace>maxNoOfSpaces){
                System.out.println("You lose");
            }
        }

    }
}
