# 8. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach der Bearbeitung dieser Aufgaben verstehen Sie das grundsätzliche Verhalten einer doppelt verketteten Liste und können Methoden für eine doppelt verkettete Liste implementieren.


## Aufgabe 1 - Doppelt verkettete Listen

Implementieren Sie eine doppelt verkettete Liste, indem Sie Klassen `DLNode` und `DLList` erstellen. Implementieren Sie dann die folgenden Methoden des abstrakten
Datentyps Liste.

  - Implementieren Sie die Methoden `isEmpty` und `size`. Nutzen Sie ein Attribut, um die Anzahl der Elemente in der Liste zu speichern.

  - Implementieren Sie als nächstes eine Methode `nodeAt` analog zur gleichnamigen Methode der einfach verketteten Liste.

  - Ändern Sie Ihre Implementierung der Methode so ab, dass der Knoten vom hinteren Ende der Liste gesucht wird, falls der gesuchte Index
    sich näher an diesem Ende befindet.

  - Nutzen Sie die Methode `nodeAt`, um die Methode `get` zu implementieren.

  - Implementieren Sie die Methode `add` mit Hilfe von Abbildung 3.10 aus dem Skript.

Nutzen Sie die folgenden Tests, um Ihre Implementierung zu testen.

```java
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
```
