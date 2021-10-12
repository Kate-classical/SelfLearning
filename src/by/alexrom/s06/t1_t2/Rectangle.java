package by.alexrom.s06.t1_t2;

public class Rectangle extends Shape {

    int side1;
    int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    int calculatePerimetr() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    double calculateArea() {
        return side1 * side2;
    }

}
