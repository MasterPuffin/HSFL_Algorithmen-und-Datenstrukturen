package com.company;

public class Lists {
    static boolean contains(StringArrayList list, String str) {
        boolean contains = false;
        for (int i = 0; i < list.size() && !contains; i++) {
            if (list.get(i) == str) {
                contains = true;
            }
        }

        return contains;
    }

    static <T> boolean contains(SLList<T> list, T e) {
        boolean contains = false;
        int i = 0;
        while(i < list.size() && !contains) {
            if (list.get(i).equals(e) || (list.get(i) == null && e == null)) {
                contains = true;
            } else {
                i++;
            }
        }
        return contains;
    }
}
