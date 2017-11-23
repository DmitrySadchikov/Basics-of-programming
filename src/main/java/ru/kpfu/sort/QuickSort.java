package ru.kpfu.sort;

public class QuickSort {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int start, int end) {
        int left = start, right = end;
        int pivot = a[(left + right) / 2]; // Опорным элементом для примера возьмём средний
        while (left <= right) {
            while (a[left] < pivot) {
                left++;
            }
            while (a[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        if (start < right) {
            sort(a, start, right);
        }
        if (end > left) {
            sort(a, left, end);
        }
    }

}
