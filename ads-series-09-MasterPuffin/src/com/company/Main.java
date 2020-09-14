package com.company;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Main {
    static SLList<String> generateSLList(int n) {
        SLList<String> l = new SLList<String>();
        for (int i = 0; i < n; i++) {
            l.add(i, "a");
        }
        return l;
    }

    static StringArrayList generateArrayList(int n) {
        StringArrayList l = new StringArrayList();
        for (int i = 0; i < n; i++) {
            l.add(i, "a");
        }
        return l;
    }

    static <T> void measure(Consumer<T> consumer) {
        long startTime = System.nanoTime();
        consumer.accept(null);
        long endTime = System.nanoTime();
        long difference = endTime - startTime;
        System.out.println("  Suche dauerte " + TimeUnit.NANOSECONDS.toMillis(difference) + "ms");
    }

    /*
    Die statischen Methoden brauchen bei der SLList länger,
    da bei jedem get() Aufruf wieder durch die gesamte Liste
    iteriert wird. Bei der Objektmethode kann .next benutzt
    werden, wodurch der entsprechende Node nicht wieder
    gesucht werden muss.
     */

    public static void main(String[] args) {
        SLList<String> sllist = generateSLList(100000);
        StringArrayList arraylist = generateArrayList(100000);

        System.out.println("Objektmethode contains für SLList");
        measure(x -> sllist.contains("b"));

        System.out.println("Objektmethode contains für StringArrayList");
        measure(x -> arraylist.contains("b"));

        System.out.println("Statische Methode contains für SLList");
        measure(x -> Lists.contains(sllist, "b"));

        System.out.println("Statische Methode contains für StringArrayList");
        measure(x -> Lists.contains(arraylist, "b"));
    }
}