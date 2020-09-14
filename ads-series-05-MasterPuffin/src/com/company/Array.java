package com.company;

public class Array {
    public static String[] expandArray(String[] array) {
        String[] returnArray = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[i];
        }
        return returnArray;
    }

    public static String[] shiftElements(String[] array, int index) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        return array;
    }
}
