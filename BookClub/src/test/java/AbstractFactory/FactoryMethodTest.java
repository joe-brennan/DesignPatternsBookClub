package AbstractFactory;

import AbstractFactory.FactoryMethod;
import org.junit.jupiter.api.Test;

class FactoryMethodTest {

    private FactoryMethod.ShapeFactory shape = new FactoryMethod.ShapeFactory("Circle");

    @Test
    void testRightShapeCreated(){
        FactoryMethod.Shape newShape = shape.getShape();
        System.out.println(FactoryMethod.Circle.class);

//        assertTrue(Matcher(newShape.isInstance(AbstractFactory.FactoryMethod.Circle.class) );
    }
}