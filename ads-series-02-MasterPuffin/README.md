# 2. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach Bearbeitung dieser Übung können Sie Elemente einer Menge in prädikativer Mengenschreibweise angeben, bestimmen, ob eine Aussage mit Quantoren wahr oder falsch ist und die Mengenoperationen Schnitt, Vereinigung und kartesisches Produkt anwenden.


## Aufgabe 1 - Prädikative Mengenschreibweise

Geben Sie die folgenden Mengen in aufzählender Mengenschreibweise an.

1.  <a href="https://www.codecogs.com/eqnedit.php?latex=\{&space;x&space;\in&space;\{&space;A,&space;B,&space;C&space;\}&space;\mid&space;x&space;=&space;A&space;\vee&space;x&space;=&space;B&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\{&space;x&space;\in&space;\{&space;A,&space;B,&space;C&space;\}&space;\mid&space;x&space;=&space;A&space;\vee&space;x&space;=&space;B&space;\}" title="\{ x \in \{ A, B, C \} \mid x = A \vee x = B \}" /></a>

2.  <a href="https://www.codecogs.com/eqnedit.php?latex=\{&space;x&space;\in&space;\{&space;A,&space;B,&space;C&space;\}&space;\mid&space;x&space;=&space;A&space;\wedge&space;x&space;=&space;B&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\{&space;x&space;\in&space;\{&space;A,&space;B,&space;C&space;\}&space;\mid&space;x&space;=&space;A&space;\wedge&space;x&space;=&space;B&space;\}" title="\{ x \in \{ A, B, C \} \mid x = A \wedge x = B \}" /></a>

3.  <a href="https://www.codecogs.com/eqnedit.php?latex=\{&space;x^2&space;\mid&space;x&space;\in&space;\mathbb{Z}&space;\wedge&space;x&space;<&space;5&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\{&space;x^2&space;\mid&space;x&space;\in&space;\mathbb{Z}&space;\wedge&space;x&space;<&space;5&space;\}" title="\{ x^2 \mid x \in \mathbb{Z} \wedge x < 5 \}" /></a>

4.  <a href="https://www.codecogs.com/eqnedit.php?latex=\{&space;x&space;\mid&space;x&space;\in&space;\mathbb{Z}&space;\wedge&space;x^2&space;<&space;5&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\{&space;x&space;\mid&space;x&space;\in&space;\mathbb{Z}&space;\wedge&space;x^2&space;<&space;5&space;\}" title="\{ x \mid x \in \mathbb{Z} \wedge x^2 < 5 \}" /></a>

5.  <a href="https://www.codecogs.com/eqnedit.php?latex=\{&space;x&space;\in&space;\mathbb{N}&space;\mid&space;\exists&space;y&space;\in&space;\{1,&space;2\}:&space;x&space;=&space;2&space;y&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\{&space;x&space;\in&space;\mathbb{N}&space;\mid&space;\exists&space;y&space;\in&space;\{1,&space;2\}:&space;x&space;=&space;2&space;y&space;\}" title="\{ x \in \mathbb{N} \mid \exists y \in \{1, 2\}: x = 2 y \}" /></a>


## Aufgabe 2 - Aussagen

Geben Sie bei den folgenden Aussagen jeweils an, ob diese wahr oder
falsch sind.

1.  <a href="https://www.codecogs.com/eqnedit.php?latex=4&space;\in&space;\{&space;1,&space;2,&space;3&space;\}&space;\Rightarrow&space;\neg&space;(4&space;=&space;4)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?4&space;\in&space;\{&space;1,&space;2,&space;3&space;\}&space;\Rightarrow&space;\neg&space;(4&space;=&space;4)" title="4 \in \{ 1, 2, 3 \} \Rightarrow \neg (4 = 4)" /></a>

2.  <a href="https://www.codecogs.com/eqnedit.php?latex=\forall&space;x&space;\in&space;\{&space;\}:&space;\exists&space;y&space;\in&space;\mathbb{N}&space;x&space;<&space;y" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\forall&space;x&space;\in&space;\{&space;\}:&space;\exists&space;y&space;\in&space;\mathbb{N}&space;x&space;<&space;y" title="\forall x \in \{ \}: \exists y \in \mathbb{N} x < y" /></a>

3.  <a href="https://www.codecogs.com/eqnedit.php?latex=\exists&space;x&space;\in&space;\{&space;1,&space;2,&space;3,&space;4&space;\}:&space;x&space;>&space;5" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\exists&space;x&space;\in&space;\{&space;1,&space;2,&space;3,&space;4&space;\}:&space;x&space;>&space;5" title="\exists x \in \{ 1, 2, 3, 4 \}: x > 5" /></a>

4.  <a href="https://www.codecogs.com/eqnedit.php?latex=\exists&space;x&space;\in&space;\mathbb{N}&space;:&space;x&space;&plus;&space;1&space;\in&space;\mathbb{N}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\exists&space;x&space;\in&space;\mathbb{N}&space;:&space;x&space;&plus;&space;1&space;\in&space;\mathbb{N}" title="\exists x \in \mathbb{N} : x + 1 \in \mathbb{N}" /></a>

5.  <a href="https://www.codecogs.com/eqnedit.php?latex=\exists&space;x&space;\in&space;\mathbb{N}&space;:&space;\forall&space;y&space;\in&space;\mathbb{N}&space;:&space;y&space;<&space;x" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\exists&space;x&space;\in&space;\mathbb{N}&space;:&space;\forall&space;y&space;\in&space;\mathbb{N}&space;:&space;y&space;<&space;x" title="\exists x \in \mathbb{N} : \forall y \in \mathbb{N} : y < x" /></a>

Versuchen Sie, jeweils zu begründen, warum eine Aussage wahr oder falsch
ist.


## Aufgabe 3 - Mengenoperationen

Geben Sie die Ergebnisse der Operationen Schnitt, Vereinigung und
kartesisches Produkt der Mengen X und Y für die folgenden Mengen
an.

1.  <a href="https://www.codecogs.com/eqnedit.php?latex=X&space;=&space;\{&space;3,&space;42&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?X&space;=&space;\{&space;3,&space;42&space;\}" title="X = \{ 3, 42 \}" /></a> und <a href="https://www.codecogs.com/eqnedit.php?latex=Y&space;=&space;\{&space;42,&space;3,&space;1&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?Y&space;=&space;\{&space;42,&space;3,&space;1&space;\}" title="Y = \{ 42, 3, 1 \}" /></a>

2.  <a href="https://www.codecogs.com/eqnedit.php?latex=X&space;=&space;\{&space;\{&space;1&space;\}&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?X&space;=&space;\{&space;\{&space;1&space;\}&space;\}" title="X = \{ \{ 1 \} \}" /></a> und <a href="https://www.codecogs.com/eqnedit.php?latex=Y&space;=&space;\{&space;1,&space;\{1\}&space;\}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?Y&space;=&space;\{&space;1,&space;\{1\}&space;\}" title="Y = \{ 1, \{1\} \}" /></a>
