/* Create an interface having prototypes of functions area() and perimeter().
Create two classes Circle and Rectangle which implements the above interface.
Create a menu driven program to find area and perimeter of objects. */

import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is : " + area);
    }

    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle with radius " + radius + " is : " + perimeter);
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle with length " + length + " and width " + width + " is : " + area);
    }

    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle with length " + length + " and width " + width + " is : " + perimeter);
    }
}

public class Inter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();

                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();

                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();

                    Rectangle rec = new Rectangle(length, width);
                    rec.area();
                    rec.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}