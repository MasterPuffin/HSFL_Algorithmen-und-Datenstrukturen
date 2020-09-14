package com.company;

public class Pair<T,R> {
    private T first;
    private R second;

    public void add(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public R getSecond() {
        return this.second;
    }
}
