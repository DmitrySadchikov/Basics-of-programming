package ru.kpfu.recursion;

public class Recursion {
    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = recursion(n - 1) * n;
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}
