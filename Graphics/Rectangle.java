package Graphics;

public class Rectangle implements Shape{
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println("Area of Rectangle : "+(length*breadth));
    }
}