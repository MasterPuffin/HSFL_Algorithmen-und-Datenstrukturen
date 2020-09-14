package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //New List of Elements
        String[] elements = {"a","b","c","d","e"};
        StringArrayList sal = new StringArrayList();

        //Add elements to StringArrayList
        for (int i = 0; i < elements.length; i++) {
            sal.add(i, elements[i]);
        }

        //Output from StringArrayList
        for (int i = 0; i < elements.length; i++) {
            System.out.println(sal.get(i));
        }
    }
}
