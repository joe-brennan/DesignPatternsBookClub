package Factory;

import org.junit.jupiter.api.Test;

import static Factory.FactoryMethod.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryMethodTest {

    private ShapeFactory shape1 = new ShapeFactory("Circle");
    private ShapeFactory shape2 = new ShapeFactory("Square");


    @Test
    void testRightShapeCreated(){
        Shape newShape = shape1.getShape();
        assertTrue(newShape instanceof Circle);
    }

    @Test
    void testShapeAssertionReturnsFalse(){
        Shape newShape = shape2.getShape();
        assertTrue(!(newShape instanceof Circle));
    }
}