import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);
        System.out.println("Circle area = "+circle1.getAreaCircle());
        // Circle area S = 19.634954

        Square square1 = new Square(7);
        System.out.println("Square area = "+square1.getAreaSquare());
        // Square area = 49.0

        Triangle triangle = new Triangle(3.2,3.4);
        System.out.println("Triangle area = "+triangle.getAreaTriangle());
        // Triangle area = 5.44
        List<Shapes> shapes = List.of(circle1,square1,triangle);


    }



}