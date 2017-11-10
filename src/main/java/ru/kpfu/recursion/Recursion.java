package ru.kpfu.recursion;

public class Recursion {

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        int p = factorial(n - 1) * n;
        return p;
    }

    public static String integers(int n) {
        if(n == 1) {
            return "1";
        }
        String s = integers(n - 1) + " " + String.valueOf(n);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(integers(20));
        System.out.println(factorial(10));
    }

}
