package Graphics;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void area(){
        System.out.println("Area of the circle is : "+(radius * 3.14 * radius));
    }
}