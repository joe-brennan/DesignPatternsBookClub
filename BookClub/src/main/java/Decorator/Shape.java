package Decorator;

public abstract class Shape {
    private double x, y;
    String description = "Unknown Shape";


    public double getCentreX() {
        return x;
    }

    public double getCentreY() {
        return y;
    }

    public String getDescription() {
        return description;
    }
}
