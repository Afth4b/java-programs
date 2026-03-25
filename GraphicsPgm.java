import Graphics.*;

public class GraphicsPgm{
    public static void main(String[] args){
        Rectangle r = new Rectangle(5,6);
        Triangle t = new Triangle(3,6);
        Square s = new Square(5);
        Circle c = new Circle(3);

        r.area();
        t.area();
        s.area();
        c.area();
    }
}