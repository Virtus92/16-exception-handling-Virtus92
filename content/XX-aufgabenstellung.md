# Aufgabenstellung: Exception handling

## Aufgabe

Erstelle eine Utility-Klasse `Calculator`, die mathematische Berechnungen durchführt und keinen State hat. 
Folgende Berechnungen sollen möglich sein und einen double ausgeben:
- static double add(double a, double b)
- static double substract(double a, double b)
- static double multiply(double a, double b)
- static double divide(double a, double b) 
- static double squareRoot(double a) throws NegativeNumberError
- static double power(double a, int b)

Sorge dafür, dass dein Programm entsprechend abgesichert ist, damit das Programm, solange weiter Berechnungen durchführt, bis der:die Benutzer:in `:q!` eingibt.
Weiters sollst du einen eigenen Error NegativeNumberError implementieren.

### Abnahmekriterien

- Der:die Teilnehmer:in kann erklären, was Exceptions sind.
- Der:die Teilnehmer:in kann erklären, wann Exceptions zu verwenden sind.
- Der:die Teilnehmer:in kann eigene Exceptions erstellen.
- Die Variablen-/Methoden-/Klassennamen sind aussagekräftig.
- Der Code ist gut strukturiert (Siehe Clean Code).
- Der Code ist in GITHub eingecheckt.