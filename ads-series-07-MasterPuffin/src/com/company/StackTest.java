package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    public void testIsEmptyNonEmpty() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        assertFalse(s.isEmpty());
    }

    @Test
    public void testIsEmptyEmpty() {
        assertTrue(new Stack<Integer>().isEmpty());
    }

    @Test
    public void testPushPop() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        assertEquals((Integer) 2, s.pop());
        assertEquals((Integer) 1, s.pop());
    }

    @Test
    public void testPushPeek() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        assertEquals((Integer) 2, s.peek());
        assertEquals((Integer) 2, s.peek());
    }
}