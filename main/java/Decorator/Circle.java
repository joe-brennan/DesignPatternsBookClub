package Decorator;

public class Circle extends Shape{
    double x, y;
    double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        description = "Shape: Circle";
    }

    public double getCentreX() {
        return x;
    }

    public double getCentreY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}