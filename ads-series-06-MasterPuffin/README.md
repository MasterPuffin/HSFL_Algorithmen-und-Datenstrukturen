# 6. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach der Bearbeitung dieser Aufgaben, wissen Sie welche Indizes einer Liste valide sind und können neue Methoden auf einer ArrayList implementieren. Außerdem verstehen Sie generische Klassen und die Implementierung einer einfach verketteten Liste.

## Aufgabe 1 - Erweiterung der Klasse StringArrayList

In dieser Aufgabe sollen Sie die Klasse `StringArrayList` um einige Funktionalitäten
erweitern. Zuerst sollen Sie Ihre Implementierung um eine
Fehlerbehandlung erweitern.

- Verändern Sie die Methoden `get` und `add` so, dass sie eine `IndexOutOfBoundsException` werfen, wenn sie
  mit einem Index aufgerufen werden, der nicht valide ist.

Als nächstes sollen Sie die Implementierung um eine Methode
erweitern. Implementieren Sie die folgende Methode:

- Die Methode `remove()` entfernt das erste Element der Liste. Obwohl dies
  grundsätzlich möglich wäre, soll Ihre Implementierung die Größe des
  Arrays nicht verringern.

## Aufgabe 2 - Generisches Paar

Implementieren Sie eine Klasse `Pair<T,R>`, um ein Paar darzustellen. In diesem Fall soll das Paar generisch über den beiden Einträgen sein. Das heißt, ein Paar `Pair<Integer,Boolean>` beschreibt zum Beispiel ein Paar, bei dem der erste Eintrag vom Typ `Integer` ist und der zweite Eintrag vom Typ `Boolean`. Fügen Sie zu Ihrer Klasse einen Konstruktor mit zwei Argumenten für die Einträge des Paares hinzu. Ihre Klasse soll für die beiden Einträge des Paares nur Getter zur Verfügung stellen.

## Aufgabe 3 - Einfach verkettete Listen

Implementieren Sie die Klassen `SLList` und `Node` sowie die Methoden `isEmpty` und `get` aus der
Vorlesung. Implementieren Sie die Methode `add` nach dem Vorgehen, das in Abbildung 3.6 des Skriptes illustriert wird.
