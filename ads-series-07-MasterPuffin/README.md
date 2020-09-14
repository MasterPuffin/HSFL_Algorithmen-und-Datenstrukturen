# 7. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach der Bearbeitung dieser Aufgaben können Sie Methoden auf einfach verketteten Listen mittels Zeichnung illustrieren. Sie verstehen die `remove`-Methode auf einer einfach verketteten Liste und können einen Stack mit Hilfe einer einfachen Verkettung implementieren.


## Aufgabe 1 - Implementierung der `remove`-Methode

Überlegen Sie sich, wie Sie die Klasse um eine `remove`-Methode erweitern
können, wie Sie im Skript im abstrakten Datentyp Liste aufgeführt ist.

  - Zeichnen Sie zunächst als Diagramm auf, wie die einfach verkettete
    Liste durch diese Methode verändert wird. Orientieren Sie sich dabei
    an Abbildung 3.6 des Skriptes.

  - Implementieren Sie auf Grundlage Ihrer Überlegungen die `remove`-Methode in
    der Klasse `SLList`.


## Aufgabe 2 - Stack

Implementieren Sie den folgenden abstrakten Datentyp mit Hilfe einer
generischen Klasse `Stack<T>`.

```
boolean isEmpty()
```

Liefert genau dann `true`, wenn der Stapel keine Elemente enthält.

```
void push(T e)
```

Packt das Element `e` auf den Stapel.

```
T pop()
```

Nimmt das oberste Element vom Stapel und liefert es zurück.

```
T peek()
```

Gibt das oberste Element vom Stapel zurück, ohne es zu entfernen.

Für die interne Speicherung der Daten benutzen Sie bitte die Klasse `Node`.
Implementieren Sie Ihre Methoden so, dass die Methoden `push` und `pop` nicht durch
den gesamten Stack laufen müssen. Ihre Implementierung soll die
folgenden Testfälle erfüllen.

```java
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
```
