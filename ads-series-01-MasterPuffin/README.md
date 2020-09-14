# 1. Übung zur Vorlesung „Algorithmen und Datenstrukturen“

Nach Bearbeitung dieser Übung können Sie bei einem Ausdruck die Präzedenzregeln anwenden und sind in der Lage Wahrheitstafeln zu erstellen.


## Aufgabe 1 - Klammerung

Geben Sie zu den folgenden Ausdrücken vollständig geklammerte Versionen
an, die sich aus den Präzedenzregeln der Junktoren ergeben. Da die
Negation stärker bindet als die Konjunktion, ist die vollständig
geklammerte Version von <a href="https://www.codecogs.com/eqnedit.php?latex=\neg&space;A_1&space;\wedge&space;A_2" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\neg&space;A_1&space;\wedge&space;A_2" title="\neg A_1 \wedge A_2" /></a> zum Beispiel
<a href="https://www.codecogs.com/eqnedit.php?latex=((\neg&space;A_1)&space;\wedge&space;A_2)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?((\neg&space;A_1)&space;\wedge&space;A_2)" title="((\neg A_1) \wedge A_2)" /></a> und nicht <a href="https://www.codecogs.com/eqnedit.php?latex=(\neg&space;(A_1&space;\wedge&space;A_2))" target="_blank"><img src="https://latex.codecogs.com/gif.latex?(\neg&space;(A_1&space;\wedge&space;A_2))" title="(\neg (A_1 \wedge A_2))" /></a>.

  - <a href="https://www.codecogs.com/eqnedit.php?latex=A_1&space;\wedge&space;\neg&space;A_2&space;\vee&space;\neg&space;A_1&space;\wedge&space;A_2" target="_blank"><img src="https://latex.codecogs.com/gif.latex?A_1&space;\wedge&space;\neg&space;A_2&space;\vee&space;\neg&space;A_1&space;\wedge&space;A_2" title="A_1 \wedge \neg A_2 \vee \neg A_1 \wedge A_2" /></a>

  - <a href="https://www.codecogs.com/eqnedit.php?latex=A_1&space;\Rightarrow&space;A_2&space;\wedge&space;A_2&space;\Leftrightarrow&space;A_1" target="_blank"><img src="https://latex.codecogs.com/gif.latex?A_1&space;\Rightarrow&space;A_2&space;\wedge&space;A_2&space;\Leftrightarrow&space;A_1" title="A_1 \Rightarrow A_2 \wedge A_2 \Leftrightarrow A_1" /></a>

  - <a href="https://www.codecogs.com/eqnedit.php?latex=\neg&space;A_1&space;\Leftrightarrow&space;A_2&space;\vee&space;A_3&space;\Rightarrow&space;A_4&space;\wedge&space;A_5" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\neg&space;A_1&space;\Leftrightarrow&space;A_2&space;\vee&space;A_3&space;\Rightarrow&space;A_4&space;\wedge&space;A_5" title="\neg A_1 \Leftrightarrow A_2 \vee A_3 \Rightarrow A_4 \wedge A_5" /></a>


## Aufgabe 2 - Wahrheitstafeln

Wahrheitstafeln können nicht nur genutzt werden, um die Bedeutung
(Semantik) eines Junktors anzugeben, sondern auch, um das Verhalten
einer Aussage zu illustrieren. Dabei werden in den Spalten die
Teilaussagen aufgeführt sowie die Aussage selbst. Die folgende
Wahrheitstafel illustriert zum Beispiel die Aussage
<a href="https://www.codecogs.com/eqnedit.php?latex=\neg&space;A_1&space;\wedge&space;A_2" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\neg&space;A_1&space;\wedge&space;A_2" title="\neg A_1 \wedge A_2" /></a>. Dabei sind <a href="https://www.codecogs.com/eqnedit.php?latex=A_1" target="_blank"><img src="https://latex.codecogs.com/gif.latex?A_1" title="A_1" /></a>, <a href="https://www.codecogs.com/eqnedit.php?latex=A_2" target="_blank"><img src="https://latex.codecogs.com/gif.latex?A_2" title="A_2" /></a> und <a href="https://www.codecogs.com/eqnedit.php?latex=\neg&space;A_1" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\neg&space;A_1" title="\neg A_1" /></a>
Teilaussagen der Aussage <a href="https://www.codecogs.com/eqnedit.php?latex=\neg&space;A_1&space;\wedge&space;A_2" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\neg&space;A_1&space;\wedge&space;A_2" title="\neg A_1 \wedge A_2" /></a>.

<a href="https://www.codecogs.com/eqnedit.php?latex=\begin{array}{cc|c|c}&space;A_1&space;&&space;A_2&space;&&space;\neg&space;A_1&space;&&space;\neg&space;A_1&space;\wedge&space;A_2\\&space;\hline&space;w&space;&&space;w&space;&&space;f&space;&&space;f\\&space;w&space;&&space;f&space;&&space;f&space;&&space;f\\&space;f&space;&&space;w&space;&&space;w&space;&&space;w\\&space;f&space;&&space;f&space;&&space;w&space;&&space;f&space;\end{array}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\begin{array}{cc|c|c}&space;A_1&space;&&space;A_2&space;&&space;\neg&space;A_1&space;&&space;\neg&space;A_1&space;\wedge&space;A_2\\&space;\hline&space;w&space;&&space;w&space;&&space;f&space;&&space;f\\&space;w&space;&&space;f&space;&&space;f&space;&&space;f\\&space;f&space;&&space;w&space;&&space;w&space;&&space;w\\&space;f&space;&&space;f&space;&&space;w&space;&&space;f&space;\end{array}" title="\begin{array}{cc|c|c} A_1 & A_2 & \neg A_1 & \neg A_1 \wedge A_2\\ \hline w & w & f & f\\ w & f & f & f\\ f & w & w & w\\ f & f & w & f \end{array}" /></a>


Geben Sie Wahrheitstafeln für die folgenden Aussagen an.

  - <a href="https://www.codecogs.com/eqnedit.php?latex=\neg&space;\neg&space;A" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\neg&space;\neg&space;A" title="\neg \neg A" /></a>

  - <a href="https://www.codecogs.com/eqnedit.php?latex=A_1&space;\Rightarrow&space;A_2&space;\Leftrightarrow&space;\neg&space;A_1&space;\wedge&space;A_2" target="_blank"><img src="https://latex.codecogs.com/gif.latex?A_1&space;\Rightarrow&space;A_2&space;\Leftrightarrow&space;\neg&space;A_1&space;\wedge&space;A_2" title="A_1 \Rightarrow A_2 \Leftrightarrow \neg A_1 \wedge A_2" /></a>

  - <a href="https://www.codecogs.com/eqnedit.php?latex=A_1&space;\wedge&space;(A_2&space;\wedge&space;A_3)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?A_1&space;\wedge&space;(A_2&space;\wedge&space;A_3)" title="A_1 \wedge (A_2 \wedge A_3)" /></a>



