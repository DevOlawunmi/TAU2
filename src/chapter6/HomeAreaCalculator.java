package chapter6;

import org.w3c.dom.css.Rect;

public class HomeAreaCalculator {
    public static void main(String[] args) {


        /**********
         * Rectangle 1
         */
        Rectangle bedroom = new Rectangle();
        bedroom.setLength(25);
        bedroom.setWidth(25);
       double bedroomArea= bedroom.calculateArea();
        System.out.println("The area of the bedroom is "+ bedroomArea);
        bedroom.calculatePerimeter();

        /**********
         * Rectangle 2
         */
Rectangle kitchen = new Rectangle(12,12);
double kitchenArea = kitchen.calculateArea();
double totalArea = bedroomArea+kitchenArea;
        System.out.println("The total area is " + totalArea);
    }
}
