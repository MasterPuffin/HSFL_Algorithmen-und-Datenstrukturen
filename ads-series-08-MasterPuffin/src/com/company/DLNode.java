package com.company;

public class DLNode<T> {
    DLNode<T> prev;
    T value;
    DLNode<T> next;

    public DLNode(DLNode<T> prev, T value, DLNode<T> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }
}