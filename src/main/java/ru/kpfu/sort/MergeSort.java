package ru.kpfu.sort;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void  sort(int[] a, int start, int end) {
        if (end <= start)
            return;
        int mid = start + (end - start) / 2;
        sort(a, start, mid);
        sort(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    private static void merge(int[] a, int start, int mid, int end) {

        int[] buf = Arrays.copyOf(a, a.length);

        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {

            if (i > mid) {                // условие выхода за пределы для первой части массива
                a[k] = buf[j];
                j++;
            } else if (j > end) {         // условие выхода за пределы для второй части массива
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) { // сравниваем элементы, если элемент из второй части массива меньше, то берем его
                a[k] = buf[j];
                j++;
            } else {                      // иначе берем элемент из первой части массива
                a[k] = buf[i];
                i++;
            }
        }
    }
}
