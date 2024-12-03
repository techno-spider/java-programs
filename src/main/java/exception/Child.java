package exception;

public class Child extends Parent {
    void share() {
        System.out.println("Child share");
    }

    public static void main(String[] args) throws Exception {
        Child c = new Child();
        c.display();
        c.share();
    }
}
