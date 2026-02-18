import java.util.Scanner;

class Area{

    // square
    double calculateArea(double side){
        return side*side;
    }

    // rectangle
    double calculateArea(double length, double breadth){
        return length * breadth;
    }

    double calculateArea(float radius){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args){
        Area obj = new Area();

        System.out.println("Area of square : "+obj.calculateArea(5));
        System.out.println("Area of rectangle : "+obj.calculateArea(5,10));
        System.out.println("Area of circle : "+obj.calculateArea(5.0f));
    }
}