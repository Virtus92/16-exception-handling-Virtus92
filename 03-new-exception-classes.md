# Neue Exceptionstypen kreieren

Jede Programmiersprache kommt bereits mit vielen vordefinierten Exceptionstypen. Allerdings gibt es Anwendungsfälle, in denen es Sinn macht, eigene Exceptionsklassen zu definieren. Z.B. weiß man, wenn eine selbstentwickelte Exception geworfen wird, dass der Fehler aus dem eigenen Programm kommt.

Die Definition einer eigenen Exceptionsklasse ist nichts anderes als die Definition einer Klasse, welche von einer andere Exception-Klasse erbt. 

## Java

Hier ein Beispiel in Java:

```java
protected class WrongValueException extends Exception {
    String s;

    public WrongValueException() {
        this(null);
    }

    public WrongValueException(String s) {
        super(s);
        this.s = s;
    }
} 
```

## C#

```c#

```



[Zurück zur Startseite](README.md)