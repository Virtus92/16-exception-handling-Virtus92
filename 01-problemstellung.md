# Problemstellung

Bisher haben wir gelernt, neue Business Logic zu produzieren. Diese hat immer solange funktioniert, bis ein Fehlerfall aufgetreten ist, der nicht vorgesehen war. Das Problem ist, dass ein solcher Fall dazu geführt hat, dass das Programm abstürzt und die Daten verloren gingen.

In der Softwareentwicklung spricht man von Exceptions: Sonderfälle, unerwartete Fälle.

> *Eine Exception ist eine Ausnahmesituation, die den normalen, erwarteten Ablauf unseres Programms unterbricht.*

Ein typischer Fall, der zu einer Exception führt, wäre z.B.: Man versucht, ein Objekt zu verwenden, allerdings ist das Objekt noch nicht instanziert worden (`NullPointerException`).

Programmiersprachen bieten hierfür sogenanntes Exception handling.

> Ziel des Exception Handlings ist es, auf bestimmte Ausnahmesituationen richtig zu reagieren und ein Weiterlaufen des Programms zu ermöglichen.

[Zurück zur Startseite](README.md)