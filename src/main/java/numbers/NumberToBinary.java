package numbers;

public class NumberToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(42));
    }

    public static String toBinary(int num) {
        if (num <= 1)
            return String.valueOf(num);
        return toBinary(num / 2) + String.valueOf(num % 2);
    }
}
