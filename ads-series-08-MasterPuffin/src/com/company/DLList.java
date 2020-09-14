package com.company;

public class DLList<T> {
    private DLNode<T> head;
    private DLNode<T> last;
    private int size;

    public DLList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public DLNode<T> nodeAt(int index) {
        //System.out.println(index);
        DLNode<T> current;
        //Determine direction of crawling
        if (index < this.size / 2) {
            //Start from beginning
            current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            //Start from end
            current = this.last;
            for (int i = this.size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    public T get(int index) {
        return nodeAt(index).value;
    }

    public void add(int index, T element) {
        if (index == 0) {
            //Insert at beginning
            if (this.size == 0) {
                this.last = this.head = new DLNode<T>(null, element, null);
            } else {
                this.head.prev = this.head = new DLNode<T>(null, element, this.head);
            }
        } else if (index == this.size) {
            //Insert at end
            this.last.next = this.last = new DLNode<T>(this.last, element, null);
        } else {
            //Insert in between
            DLNode<T> pred = nodeAt(index - 1);
            pred.next.prev = pred.next = new DLNode<T>(pred, element, pred.next);
        }
        this.size++;
    }
}
