package staticexample;

public class StaticMethodsExample {

    public static String myMethod(String str) {
        return str.toUpperCase();
    }

    public static String myMethod(String str, int i) {
        return str.toUpperCase();
    }

    public static String myMethod(int i, String str) {
        return str.toUpperCase();
    }

    public void myMethod() {
        System.out.println("Non-static myMethod");
    }

    public static void main(String[] args) {
        StaticMethodsExample sme = new StaticMethodsExample();
        sme.myMethod();
        String result = StaticMethodsExample.myMethod("java");
        System.out.println(result);
    }
}
