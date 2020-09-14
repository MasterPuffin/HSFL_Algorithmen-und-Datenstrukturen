# 9. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach der Bearbeitung dieser Aufgaben können Sie die Suche eines Elementes in einer Liste implementieren, ohne, die Schleife mittels `break` oder `return` zu verlassen.
Sie haben außerdem ein grundlegendes Verständnis für die Laufzeit verschiedener Methoden auf Listen.


## Aufgabe 1 - Suchen eines Elements

In dieser Aufgabe sollen Sie einen Eintrag in einer Liste suchen.

- Implementieren Sie in Ihrer Klasse `StringArrayList` die folgende Methode

  ```java
  public boolean contains(String str)
  ```

  die einen Wert in der Liste sucht. Sie soll `true` liefern, wenn der übergebene Wert existiert und `false`, wenn er nicht existiert.
  Ihre Methode soll die Suche abbrechen sobald das Element gefunden wurde.
  Die Schleife soll aber nicht durch die Verwendung von `return` oder `break` oder das Verändern des Zählers verlassen werden.

- Implementieren Sie `contains` analog zu der vorherigen Methode in der Klasse `SLList`.

  ```java
  public boolean contains(T e)
  ```

- Erweitern Sie Ihre Klasse `SLList` um eine `size()`-Methode, die ein Attribut nutzt.
  
- Implementieren Sie nun in einer Klasse `Lists` die folgenden Methoden.

  ```java
  static boolean contains(StringArrayList list, String str)

  static <T> boolean contains(SLList<T> list, T e)
  ```
  
  Diese Methoden sollen ein Element in der jeweils übergebenen Liste suchen.
  Hier ist wichtig, dass diese Methoden außerhalb der Klassen `StringArrayList` und `SLList` definiert werden.


## Aufgabe 2 - Laufzeit messen

In dieser Aufgabe sollen Sie messen, wie lange das Suchen eines Elements in einer Liste im _worst case_ dauert.
Dabei sollen Sie die vier Varianten von `contains` vergleichen.
Binden Sie den folgenden Code in Ihr Projekt ein.

```java
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
```

- Führen Sie die `main`-Methode aus.
  Erklären Sie große Unterschiede in den Laufzeiten.
