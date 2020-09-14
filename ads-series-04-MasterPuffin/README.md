# 4. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach Bearbeitung dieser Aufgaben haben Sie Ihr grundsätzliches Verständnis für Objekte in Java aufgefrischt. Außerdem haben Sie wiederholt, wie in Java mit Arrays gearbeitet wird und kennen den Unterschied zwischen einer Methode, die ein neues Array liefert und einer Methode, die ein Array verändert.


## Aufgabe 1 - Paar

In dieser Aufgaben sollen Sie eine einfache Paar-Struktur in Java
definieren.

-   Implementieren Sie eine Klasse `StringPair`, um ein Paar mit zwei `String`s darzustellen.
    Fügen Sie zu Ihrer Klasse einen Konstruktor mit zwei Argumenten für die Einträge des Paars hinzu.
    Ihre Klasse soll für die beiden Einträge des Paars nur *Getter* zur Verfügung stellen.nd e

## Aufgabe 2 - Arrays

In dieser Aufgabe sollen Sie die ersten Schritt für die Implementierung
einer `ArrayList` durchführen. Beachten Sie, dass Sie die Testfälle nicht verändern
dürfen.

-   Implementieren Sie eine Methode `expandArray`, die ein Array von Zeichenketten
    erhält und ein Array mit den gleichen Elementen liefert, das aber
    doppelt so groß ist wie das übergebene Array. Ihre Implementierung
    soll den folgenden Testfall erfüllen.

```java
@Test
public void testExpandArray() {
  String[] a = {"a", "b", "c", "d", "e"};
  String[] b = Arrays.expandArray(a);
  assertEquals(2 * a.length, b.length);
  for (int i = 0; i < a.length; i++) {
    assertEquals(a[i], b[i]);
  }
}
```

-   Implementieren Sie eine Methode `shiftElements`, die ein Array und eine Zahl
    erhält. Alle Elemente mit einem Index größer gleich werden im Array
    um eine Position nach rechts verschoben. Ihre Implementierung soll
    den folgenden Testfall erfüllen. Die Methode `shiftElements` soll kein Hilfs-Array
    verwenden. Bei einem Aufruf der Methode `shiftElements` geht ggf. ein Element
    verloren.

```java
@Test
public void testShiftElements() {
  String[] a = {"a", "b", "c", "d", "e"};
  String[] b = a.clone();
  int i = 1;
  Arrays.shiftElements(a, i);
  for (int j = 0; j < i; j++) {
    assertEquals(b[j], a[j]);
  }
  for (int j = i; j < a.length - 1; j++) {
    assertEquals(b[j], a[j + 1]);
  }
}
```
