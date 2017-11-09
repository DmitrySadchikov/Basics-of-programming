package ru.kpfu.list;

public class Node {

    public int value;
    public Node next;

    public Node(int element) {
        this.value = element;
    }

    public Node(int element, Node next) {
        this.value = element;
        this.next = next;
    }

    public Node next() {
        return next;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
