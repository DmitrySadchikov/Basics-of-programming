package ru.kpfu.sort;

public class Main {

    private static void show(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] b = a.clone();
        int[] c = a.clone();
        int[] d = a.clone();
        System.out.println("Сортировка пузырьком: ");
        show(a);
        BubbleSort.sort(a);
        show(a);
        System.out.println("Сортировка перемешиванием: ");
        show(b);
        CocktailSort.sort(b);
        show(b);
        System.out.println("Сортировка вставками: ");
        show(c);
        InsertionSort.sort(c);
        show(c);
        System.out.println("Сортировка слиянием: ");
        show(d);
        MergeSort.sort(d);
        show(d);
    }
}
