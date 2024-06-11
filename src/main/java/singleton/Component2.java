package singleton;

public class Component2 {

    void doSomethingElse() {
        // Get the singleton instance of Logger class
        Logger logger = Logger.getInstance();

        // Log a message from Component2
        logger.log("Component2 is doing something else..");
    }
}