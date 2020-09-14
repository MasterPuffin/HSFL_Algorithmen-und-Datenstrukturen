package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLListTest {

    @Test
    public void testIsEmpty() {
        DLList<String> l = new DLList<>();
        assertTrue(l.isEmpty());
        l.add(0, "a");
        assertFalse(l.isEmpty());
    }

    @Test
    public void testSize() {
        DLList<String> l = new DLList<>();
        assertEquals(0, l.size());
        l.add(0, "a");
        assertEquals(1, l.size());
    }

    @Test
    public void testAddAtTheEnd() {
        DLList<String> l = new DLList<>();
        l.add(0, "a");
        l.add(1, "b");
        l.add(2, "c");
        l.add(3, "d");

        assertEquals("a", l.get(0));
        assertEquals("b", l.get(1));
        assertEquals("c", l.get(2));
        assertEquals("d", l.get(3));
    }

    @Test
    public void testAddAtTheBeginning() {
        DLList<String> l = new DLList<>();
        l.add(0, "b");
        l.add(0, "a");

        assertEquals("a", l.get(0));
        assertEquals("b", l.get(1));
    }

    @Test
    public void testAddBetween() {
        DLList<String> l = new DLList<>();
        l.add(0, "a");
        l.add(1, "c");
        l.add(1, "b");

        assertEquals("a", l.get(0));
        assertEquals("b", l.get(1));
        assertEquals("c", l.get(2));
    }
}