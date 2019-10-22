package Decorator;

public class Square extends Shape{
    double x, y;
    double radius;

    public Square(double x, double y) {
        this.x = x;
        this.y = y;
        description = "Shape: Square";
    }

    public double getCentreX() {
        return x;
    }

    public double getCentreY() {
        return y;
    }
}