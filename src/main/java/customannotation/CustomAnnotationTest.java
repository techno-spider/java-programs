package customannotation;

import stream.Employee;

@Important
public class CustomAnnotationTest extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("Thread sleep finished");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        @SuppressWarnings("unused") CustomAnnotationTest test2 = new CustomAnnotationTest();
        CustomAnnotationTest test = new CustomAnnotationTest();
        test.start();
        test.join();
        System.out.println("HELLO");


        if (test.getClass()
                .isAnnotationPresent(Important.class))
            System.out.println("This thing is Important");
        else
            System.out.println("This thing is NOT Important");

        Employee employee = new Employee("Bob", 23, "bob@yoyo.com");
        if (employee.getClass()
                    .isAnnotationPresent(Important.class))
            System.out.println("This thing is Important");
        else
            System.out.println("This thing is NOT Important");
    }
}


