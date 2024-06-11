package singleton;

public class Application {
    public static void main(String[] args) {

        // Get the instance of Logger
        Logger logger = Logger.getInstance();

        Component1 component1 = new Component1();
        Component2 component2 = new Component2();

        // Log messages from Component1
        logger.log("Starting operation in Component1..");
        component1.doSomething();

        // Log messages from Component2
        logger.log("Starting operation in Component2..");
        component2.doSomethingElse();

        logger.log("Application execution completed.");
    }
}