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
        return this.array[position];
    }

    public void add(int position, String value) {
        //Check if array is large enough
        if (this.array.length <= this.size) {
            //Array is to small expand
            this.array = Array.expandArray(this.array);
        }

        //Check if we are adding the item to the end of the array. If not we have to shift the elements as the array at this position can't be empty
        if (this.array.length - 1 != position) {
            //Shift elements to make space for new value
            this.array = Array.shiftElements(this.array, position);
        }
        //Set value to array
        this.array[position] = value;
        this.size++;
    }
}
