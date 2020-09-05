package chapter4;

import java.util.Scanner;

/*
I want them to enter a word
Then I'll loop through it to see if it contains a particular letter,
to do this I'll need to know the particular char it's on
Then I'll like to know if it has been found
 */
public class LetterSearch2 {
    public static void main(String[] args) {
        boolean isFound = false;
        System.out.println("Enter a word");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                isFound = true;
                break;
            }
        }if (isFound)
            System.out.println("This word contains the letter A");
        else System.out.println("This word does not contain the letter a");
    }
}