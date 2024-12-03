package designpatterns.singleton;

public class Component1 {

    void doSomething() {
        // Get the singleton instance of Logger class
        Logger logger = Logger.getInstance();

        // Log a message from Component1
        logger.log("Component1 is doing something..");
    }
}