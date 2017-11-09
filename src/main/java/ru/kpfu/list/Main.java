package ru.kpfu.list;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains(3));
        System.out.println(linkedList.contains(43));

        int[] a = new int[10];
        linkedList.copyTo(a);
        System.out.println(Arrays.toString(a));
    }
}
