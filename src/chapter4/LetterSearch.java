package chapter4;

import java.util.Scanner;

//Search a string to determine it contains the letter A
public class LetterSearch {
    public static void main(String[] args) {
        System.out.println("Please enter a word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char currentLetter;
        boolean letterFound = false;

        for (int i = 0; i < word.length(); i++) {
            currentLetter = word.charAt(i);

            if (currentLetter == 'A'|| currentLetter=='a') {
                letterFound = true;
break;
            }
        }
        if (letterFound) System.out.println("This word contains A");
        else System.out.println("This word does not contain A");
    }
}



















//        boolean letterFound = false;
//
//        for (int i = 0; i < word.length(); i++) {
//            char currentLetter = word.charAt(i);
//            if (currentLetter == 'a' || currentLetter == 'A') {
//                letterFound = true;
//                break;
//            }
//        }
//            if (letterFound) {
//                System.out.println("This word contains the letter A");
//            } else {
//                System.out.println("This word does not contain the letter A");
//            }
//        }
//    }

