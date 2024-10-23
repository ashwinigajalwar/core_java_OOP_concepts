import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        Circle circle=new Circle(2.0);
        Square square=new Square(16.0);
        shapes.add(circle);


        for (Shape shape : shapes) {

            shape.draw();
        }

        System.out.println("Area of Circle:"+ circle.calculateArea());
        System.out.println("Area of Square:"+ square.calculateArea());

        Geometry geometry=new Geometry();
        Geometry.Point point= geometry.new Point(30,40);
        point.displayPoint();
    }
}
