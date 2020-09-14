package com.company;

public class StringArrayList {
    //Keeps track of the array size
    private int size = 0;
    //The main internal array
    private String[] array = new String[0];

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public String get(int position) {
        //Check if element exists in array
        if (this.array.length > position && position >= 0) {
            return this.array[position];
        } else {
            throw new IndexOutOfBoundsException("Invalid position");
        }
    }

    public void add(int position, String value) {
        //Check if position is valid
        if (this.array.length + 1 > position && position >= 0) {
            //Check if array is large enough
            if (this.array.length <= this.size) {
                //Array is to small expand
                this.array = Array.expandArray(this.array);
            }
            //Check if we are adding the item to the end of the array. If not we have to shift the elements as the array at this position can't be empty
            if ((this.size) != position) {
                //Shift elements to make space for new value
                Array.shiftElements(this.array, position);
            }
            //Set value to array
            this.array[position] = value;
            this.size++;
        } else {
            throw new IndexOutOfBoundsException("Invalid position");
        }
    }

    public String remove(int position) {
        //Get value for return
        String value = this.array[position];

        //Shift array
        for (int i = position; i < this.array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        //Reduce size counter
        this.size--;

        return value;
    }

    public boolean contains(String str) {
        boolean contains = false;
        int i = 0;
        while (!contains && i < this.size) {
            if (this.array[i] == str) {
                contains = true;
            } else {
                i++;
            }
        }
        return contains;
    }
}
