package Graphics;

public class Square implements Shape{
    double side;

    public Square(double side){
        this.side = side;
    }

    public void area(){
        System.out.println("Area of square is : "+(side * side));
    }
}