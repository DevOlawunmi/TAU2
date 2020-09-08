package chapter6;

public class Rectangle {
    double length;
    double width;


    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }
    public Rectangle(){
        length=0;
        width=0;
    }
    public Rectangle(double length, double width){
        setLength(length);
        this.width=width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
