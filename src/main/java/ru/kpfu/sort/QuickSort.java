package ru.kpfu.sort;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] a) {
        qsort(a, 0, a.length - 1);
    }

    private static void qsort(int[] a, int b, int e) {
        int l = b, r = e;
        int piv = a[(l + r) / 2]; // Опорным элементом для примера возьмём средний
        while (l <= r) {
            while (a[l] < piv) {
                l++;
            }
            while (a[r] > piv) {
                r--;
            }
            if (l <= r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }
        if (b < r) {
            qsort (a, b, r);
        }
        if (e > l) {
            qsort (a, l, e);
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

}
