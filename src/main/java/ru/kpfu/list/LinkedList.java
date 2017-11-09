package ru.kpfu.list;

public class LinkedList {

    private Node first;
    private int size;

    public void add(int element) {
        Node newNode = new Node(element);
        if(isEmpty()) {
            first = newNode;
            size++;
            return;
        }
        Node node = first;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        size++;
    }

    public boolean contains(int element) {
        Node current = first;
        while (current != null) {
            if(current.value == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public void copyTo(int[] a) {
        if(a.length < size) {
            return;
        }
        Node current = first;
        for (int i = 0; i < size; i++) {
            a[i] = current.value;
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove(int element) {
        Node previous = null;
        Node current = first;
        while (current != null) {
            if(current.value == element) {
                if(previous == null) {
                    first = first.next;
                } else {
                    previous.next = current.next;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = first;
        while (current.next != null) {
            result += current.value + ", ";
            current = current.next;
        }
        return result + current.value + "]";
    }
}
