package ru.kpfu.sort;

public class Main {

    private static void show(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray() {
        return new int[] {8, 6, 2, 4, 3, 1, 5, 7};
    }

    public static void main(String[] args) {
        int[] a = createArray();
        int[] b = createArray();
        int[] c = createArray();
        int[] d = createArray();
        int[] e = createArray();
        int[] f = createArray();

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
        System.out.println("Сортировка слиянием с рекурсией: ");
        show(d);
        MergeSort.sort(d);
        show(d);
        System.out.println("Сортировка слиянием без рекурсии: ");
        show(e);
        MergeSort.nonRecursiveSort(e);
        show(e);
        System.out.println("Быстрая сортировка: ");
        show(f);
        QuickSort.sort(f);
        show(f);
    }
}
