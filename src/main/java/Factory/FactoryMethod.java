package Factory;

public class FactoryMethod {

    public interface Shape {
        void draw();
    }

    public static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Rectangle");
        }
    }

    public class Triangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Triangle");
        }
    }

    public static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle");
        }
    }

    public static class ShapeFactory {
        final String shape;

        public ShapeFactory(String shape) {
            this.shape = shape;
        }

        public Shape getShape() {
            if (shape == null) {
                return null;
            }
            if (shape.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (shape.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            }
            return null;
        }
    }
}
