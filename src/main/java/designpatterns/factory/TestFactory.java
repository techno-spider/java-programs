package designpatterns.factory;

// Defines an interface for creating objects but lets subclasses alter the type of objects that will be created.
// Usage: Creating objects without specifying the exact class.

public class TestFactory {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method
        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();

        // Get an object of Square and call its draw method
        Shape shape3 = factory.getShape("SQUARE");
        shape3.draw();
    }
}

/*
 * output:
 * Inside Circle :: draw() method
 * Inside Rectangle :: draw() method
 * Inside Square :: draw() method
 * */