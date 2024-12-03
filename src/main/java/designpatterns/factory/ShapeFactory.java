package designpatterns.factory;

/* The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass,
but allows subclasses to alter the type of objects that will be created.*/

// Defines an interface for creating objects but lets subclasses alter the type of objects that will be created.
// Usage: Creating objects without specifying the exact class.

public class ShapeFactory {

    // Use getShape method to get object of type shape

    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }
}
