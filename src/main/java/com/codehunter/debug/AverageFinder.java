package com.codehunter.debug;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        String[] strarr = {"37", "12", "49", "7", "25"};
        double avg = findAverage(strarr);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result/input.length;
    }
}
