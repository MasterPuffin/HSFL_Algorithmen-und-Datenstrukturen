# 5. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach Bearbeitung dieser Aufgaben verstehen Sie die Implementierung einer ArrayList.


## Aufgabe 1 - com.company.StringArrayList

Implementieren Sie die Methoden `isEmpty`, `size`, `get` und `add` des abstrakten Datentyps “Liste von Zeichenketten”.
Die Anzahl der Elemente in der Liste können Sie als Attribut in der Klasse `com.company.StringArrayList` speichern.
Verwenden Sie zur Speicherung der Einträge der Liste ein Array vom Typ `String[]`.
Der Konstruktor für eine leere Liste verwendet ein Array der Größe eins.
Implementieren Sie die Methode `add` mit Hilfe der drei Schritte in Abbildung 3.3 des Skriptes.
Verwenden Sie die Methoden `expandArray` und `shiftElements`, die Sie bereits implementiert haben.

Bitte beachten Sie, dass die Anzahl der Elemente in der Liste nicht der Größe des Arrays entspricht.
Beachten Sie außerdem, dass ein valider Wert des Typs ist.
Daher soll man den Wert wie jeden anderen Wert in einer Liste ablegen können.

Ihre Implementierung soll die folgenden Tests erfüllen.

```java
@Test
public void testIsEmpty() {
  com.company.StringArrayList l = new com.company.StringArrayList();
  assertTrue(new com.company.StringArrayList().isEmpty());
  l.add(0, "a");
  assertFalse(l.isEmpty());
}

@Test
public void testSize() {
  com.company.StringArrayList l = new com.company.StringArrayList();
  assertEquals(0, l.size());
  l.add(0, "a");
  assertEquals(1, l.size());
}

@Test
public void testAddGet() {
  com.company.StringArrayList l = new com.company.StringArrayList();
  l.add(0, "a");
  l.add(0, "b");
  assertEquals("a", l.get(1));
}

@Test
public void testNull() {
  com.company.StringArrayList l = new com.company.StringArrayList();
  l.add(0, null);
  assertFalse(l.isEmpty());
  assertEquals(1, l.size());
  assertEquals(null, l.get(0));
}
```

Implementieren Sie eine weitere Klasse mit einer `main`-Methode, die Ihre Implementierung nutzt.
Fügen Sie fünf Elemente in eine Liste ein und geben Sie die Elemente der Liste mit Hilfe einer Schleife auf der Konsole aus.

**Hinweis:** Sie müssen in Ihren Aufgaben keine Fehlerbehandlung durchführen, das heißt, wir gehen davon aus, dass die Methoden immer korrekt aufgerufen werden.
Zum Beispiel gehen wir davon aus, dass die Methode `get` nur mit einem Index aufgerufen wird, der auch tatsächlich existiert.
