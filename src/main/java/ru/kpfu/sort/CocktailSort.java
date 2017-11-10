package ru.kpfu.sort;

public class CocktailSort {

    public static void sort(int[] array) {
        int left = 0; // левая граница
        int right = array.length - 1; // правая граница

        do {
            // Сдвигаем к концу массива "тяжелые элементы"
            for (int i = left; i < right; i++) {
                if(array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
            right--; // уменьшаем правую границу
            // Сдвигаем к началу массива "легкие элементы"
            for (int i = right; i > left; i--) {
                if(array[i] < array[i - 1]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                }
            }
            left++; // увеличиваем левую границу
        } while (left <= right);
    }
}
