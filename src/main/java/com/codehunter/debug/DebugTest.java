package com.codehunter.debug;

public class DebugTest {
    public static void main(String[] args) {
        System.out.println("Going to debug simple java app");

        int[] myarr = {4, 13, 76, 9};
        int sum = getSum(myarr);
        System.out.println("Sum: " + sum);
    }

    public static int getSum(int[] arr) {
        int s = 0;
        for (int j : arr) {
            s = s + j;
        }
        s = s + 5;
        return s;
    }
}
