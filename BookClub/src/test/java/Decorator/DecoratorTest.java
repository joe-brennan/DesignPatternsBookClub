package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void defaultCircleTest() {
        Shape circle = new Circle(1, 2, 50);
        assertEquals("Shape: Circle",circle.getDescription());
    }

    @Test
    public void givenCircleDecorateWithColour() {
        Shape circle = new Circle(1, 2, 50);
        circle = new ColouredShape(circle,"#000000");
        assertEquals("Shape: Circle, Colour Code: #000000",circle.getDescription());
    }

    @Test
    public void defaultSquareTest() {
        Shape square = new Square(1, 2);
        assertEquals("Shape: Square",square.getDescription());

    }

    @Test
    public void givenSquareDecorateWithColour() {
        Shape square = new Square(1, 2);
        square = new ColouredShape(square,"#000000");
        assertEquals("Shape: Square, Colour Code: #000000",square.getDescription());
    }

    @Test
    public void givenSquareMultipleDecorate() {
        Shape square = new Square(1, 2);
        square = new ColouredShape(square,"#000000");
        square = new LineStyle(square,"Dotted");
        assertEquals("Shape: Square, Colour Code: #000000, Style: Dotted",square.getDescription());
    }

}