package com.company;

import com.company.StringArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayListTest {
    @Test
    public void testIsEmpty() {
        StringArrayList l = new StringArrayList();
        assertTrue(new StringArrayList().isEmpty());
        l.add(0, "a");
        assertFalse(l.isEmpty());
    }

    @Test
    public void testSize() {
        StringArrayList l = new StringArrayList();
        assertEquals(0, l.size());
        l.add(0, "a");
        assertEquals(1, l.size());
    }

    @Test
    public void testAddGet() {
        StringArrayList l = new StringArrayList();
        l.add(0, "a");
        l.add(0, "b");
        assertEquals("a", l.get(1));
    }

    @Test
    public void testNull() {
        StringArrayList l = new StringArrayList();
        l.add(0, null);
        assertFalse(l.isEmpty());
        assertEquals(1, l.size());
        assertEquals(null, l.get(0));
    }
}