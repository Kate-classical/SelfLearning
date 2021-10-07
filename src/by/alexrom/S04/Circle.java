package by.alexrom.S04;

public class Circle {

    public static void main(String[] args) {

    }

    final double INITIAL_RADIUS = 0.0;
    final double INITIAL_xCoordinate = 0.0;
    final double INITIAL_yCoordinate = 0.0;

    private double radius;
    private double xCoordinate;
    private double yCoordinate;

    public Circle() {
        this.radius = INITIAL_RADIUS;
        this.xCoordinate = INITIAL_xCoordinate;
        this.yCoordinate = INITIAL_yCoordinate;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.xCoordinate = INITIAL_xCoordinate;
        this.yCoordinate = INITIAL_yCoordinate;
    }

    public double squareOfCircle() {
        return Math.PI * this.radius * this.radius;
    }

    public void setCenterOfCircle(double xCoordinate, double yCoordinate) {
        this.yCoordinate = yCoordinate;
        this.xCoordinate = xCoordinate;
    }

    public double distanceBetweenCenter(Circle circle) {
        double x = Math.abs(circle.xCoordinate - this.xCoordinate);
        double y = Math.abs(circle.yCoordinate - this.yCoordinate);

        return Math.sqrt(x * x + y * y);
    }

    public boolean isIntersect(Circle circle) {
        return distanceBetweenCenter(circle) <= (circle.getRadius() + this.radius);
    }

    public double getRadius() {
        return radius;
    }

}
