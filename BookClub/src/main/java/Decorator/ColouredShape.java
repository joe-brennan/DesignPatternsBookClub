package Decorator;

public class ColouredShape extends ShapeDecorator {
    private Shape shape;
    private String colour;

    public ColouredShape(Shape shape , String colour) {
        this.shape = shape;
        this.colour = colour;
    }

    public String getDescription() {
        return shape.getDescription() + ", Colour Code: " + colour;
    }

}