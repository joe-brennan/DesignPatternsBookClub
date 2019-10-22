package Decorator;

public class LineStyle extends ShapeDecorator {

    String style;
    Shape shape;

    public LineStyle(Shape shape, String style){
        this.shape = shape;
        this.style = style;
    }


    @Override
    public String getDescription() {
        return shape.getDescription() + ", Style: " + style;
    }
}
