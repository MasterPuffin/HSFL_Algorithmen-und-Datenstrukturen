package com.company;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @org.junit.jupiter.api.Test
    public void testExpandArray() {
        String[] a = {"a", "b", "c", "d", "e"};
        String[] b = ArrayList.expandArray(a);
        assertEquals(2 * a.length, b.length);
        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i], b[i]);
        }
    }

    @org.junit.jupiter.api.Test
    public void testShiftElements() {
        String[] a = {"a", "b", "c", "d", "e"};
        String[] b = a.clone();
        int i = 1;
        ArrayList.shiftElements(a, i);
        for (int j = 0; j < i; j++) {
            assertEquals(b[j], a[j]);
        }
        for (int j = i; j < a.length - 1; j++) {
            assertEquals(b[j], a[j + 1]);
        }
    }
}