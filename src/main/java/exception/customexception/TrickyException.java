package exception.customexception;

public class TrickyException {

    public static int myMethod() {
        try {
            return 10;
            // only return / throw exception is allowed in try block
            // throw new RuntimeException();
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }

    public static void main(String[] args) {
        int i = myMethod();
        System.out.println(i);
    }
}

/*
output: 30
*/