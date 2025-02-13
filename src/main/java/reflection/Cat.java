package reflection;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow method");
    }

    private void privateMethod() {
        System.out.println("How did you call this private method?");
    }

    public static void publicStaticMethod() {
        System.out.println("This is public static method");
    }

    private static void privateStaticMethod() {
        System.out.println("This is private static method");
    }
}
