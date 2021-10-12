package by.alexrom.s06.t1_t2;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(2);

        Rectangle rectangle = new Rectangle(2, 4);

        Triangle triangle = new Triangle(3, 4, 5);

        Shape[] shapes = new Shape[]{triangle, rectangle, square};
        System.out.println(shapesArea(shapes));

    }

    static double shapesArea(Shape[] shapes) {
        double total = 0;
        for (Shape s : shapes) {
            total = total + s.calculateArea();
        }
        return total;
    }

}
