package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Rectangle kitchen = getRoom();
        Rectangle patio = getRoom();
        double area = calculateTotalArea(kitchen,patio);

        System.out.println(area);
    }

    private static Rectangle getRoom() {
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);

    }

    private static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea()+rectangle2.calculateArea();
    }
}
