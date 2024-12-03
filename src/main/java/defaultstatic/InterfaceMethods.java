package defaultstatic;

interface InterfaceMethods {
    void square(int a);

    default void show() {
        System.out.println("Default method executed.");
    }

    static void display() {
        System.out.println("Static method executed.");
    }

}
