package com.company;

public class Stack<T> {
    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    boolean isEmpty() {
        return this.head == null;
    }

    void push(T e) {
        this.head = new Node<T>(e, this.head);
    }

    T pop() {
        T curval = this.head.value;
        this.head = this.head.next;
        return curval;
    }

    T peek() {
        return this.head.value;
    }
}
