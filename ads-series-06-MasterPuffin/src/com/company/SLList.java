package com.company;

public class SLList<T> {
    private Node<T> head;

    public SLList() {
        this.head = null;
    }

    private Node<T> nodeAt(int index) {
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T get(int index) {
        return nodeAt(index).value;
    }

    public void add(int index, T e) {
        if (index == 0) {
            this.head = new Node<T>(e, this.head);
        } else {
            Node<T> pred = nodeAt(index - 1);
            pred.next = new Node<T>(e, pred.next);
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}