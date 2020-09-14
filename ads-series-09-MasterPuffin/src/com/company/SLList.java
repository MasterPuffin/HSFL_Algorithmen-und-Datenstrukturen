package com.company;

public class SLList<T> {
    private Node<T> head;
    private int size;

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
        this.size++;
    }

    public T remove(int index) {
        T curval;
        if (index == 0) {
            //Get current value
            curval = head.value;
            //Set head to next value
            head = head.next;
        } else {
            //Get previous node
            Node<T> pred = nodeAt(index - 1);
            //Get current node
            curval = pred.next.value;
            //Set next of previous node to next of next node;
            pred.next = pred.next.next;
        }
        this.size--;
        //Return current value
        return curval;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean contains(T e) {
        boolean contains = false;
        Node<T> pred = this.head;
        while (!contains && pred != null) {
            if (pred.value == e) {
                contains = true;
            }
            pred = pred.next;
        }
        return contains;
    }

    public int size() {
        return this.size;
    }
}