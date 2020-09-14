package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Aufgabe 1
        StringPair test = new StringPair("mein", "haus");
        System.out.println(test.getStrA() + test.getStrB());

        //Aufgabe 2.1
        String[] array = new String[]{"A", "B", "C", "D", "E"};

        String[] x = ArrayList.expandArray(array);
        System.out.println(Arrays.toString(x));

        //Aufgabe 2.2
        String[] y = ArrayList.shiftElements(array, 1);
        System.out.println(Arrays.toString(y));

    }
}