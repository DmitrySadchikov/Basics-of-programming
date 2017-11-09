package ru.kpfu.sort;

public class InsertionSort {

    public static void sort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i; j >= 1 && a[j] < a[j - 1]; j--) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sort(a);
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
