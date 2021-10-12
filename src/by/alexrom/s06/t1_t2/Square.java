package by.alexrom.s06.t1_t2;

public class Square extends Shape {

    int side1;

    @Override
    int calculatePerimetr() {
        return side1 * 4;
    }

    @Override
    double calculateArea() {
        return side1 * side1;
    }

    public Square(int side1) {
        this.side1 = side1;
    }
}
