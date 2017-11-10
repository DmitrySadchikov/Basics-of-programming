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
}
