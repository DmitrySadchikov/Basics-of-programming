package ru.kpfu.arrays;

public class Array {

    public int[] a;  // поле, которое принадлежит объекту типа Array
    public int size;

    public Array(int[] a, int size) {
        this.a = a;
        this.size = size;
    }

    public void updateMemory() {
        int n = a.length;
        Double m = n * 1.5;
        int[] b = new int[m.intValue()];
        for(int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        a = b;
    }

    public void add(int index, int value) {
        int n = a.length;
        if(size == n) {
            updateMemory();
        }

        for(int i = size - 1; i >= index; i--) {
            a[i + 1] = a[i];
        }
        a[index] = value;
        size++;
    }

    public void remove(int index) {
        for(int i = index + 1; i < size; i++) {
            a[i - 1] = a[i];
        }
        a[size - 1] = 0;
        size--;
    }

    /**
     * Вывод массива на консоль
     */
    public void show() {
        for(int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 0, 0, 0}; // создаем массив с тремя элементами и тремя служебными
        int size = 3;                 // реальный размер массива
        Array array = new Array(a, size); // создаем объект array - экземпляр класса Array
        array.show();                     // вывод массива на консоль
        array.remove(0);
        array.add(1, 13);
        array.show();
    }
}
