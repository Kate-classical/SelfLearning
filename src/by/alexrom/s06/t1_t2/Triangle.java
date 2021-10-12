package by.alexrom.s06.t1_t2;

public class Triangle extends Shape {

    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    int calculatePerimetr() {

        return calPer();
    }

    private int calPer() {
        return side1 + side2 + side3;
    }

    @Override
    double calculateArea() {
        int p = calPer() / 2;
        return (int) Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
