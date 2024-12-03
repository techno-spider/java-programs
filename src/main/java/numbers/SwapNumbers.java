package numbers;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        System.out.println("Before swapping: " + x + " " + y);
//        x = x ^ y;
//        y = x ^ y;
//        x = x ^ y;

        x = x + y; //30
        y = x - y; // 10
        x = x - y; // 20

        System.out.println("After swapping: " + x + " " + y);

    }
}
