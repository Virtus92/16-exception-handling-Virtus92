# Neue Exceptionstypen kreieren

Jede Programmiersprache kommt bereits mit vielen vordefinierten Exceptionstypen. Allerdings gibt es Anwendungsfälle, in denen es Sinn macht, eigene Exceptionsklassen zu definieren. Z.B. erkennt man, wenn eine selbstentwickelte Exception geworfen wird, dass der Fehler aus dem eigenen Programm kommt. 

Man erstellt eigene Exceptions, um spezifischere Informationen über einen Fehlerfall auszugeben, welche von einem Standardexception der Programmiersprache nicht ausgegeben werden würden.

Die Definition einer eigenen Exceptionsklasse ist nichts anderes als die Definition einer Klasse, welche von einer anderen Exception-Klasse erbt. 

Hier ein Beispiel in Java:

```java
// Java

public class WrongValueException extends Exception {
    String s;

    public WrongValueException() {
        this("Es wurde ein falscher Wert erkannt!");
    }

    public WrongValueException(String message) {
        super(message);
    }

    public WrongValueException(String message, Exception innerException) {
        super(message, innerException);
    }
} 
```

## C#

```csharp
// C# 
using System;

public class WrongValueException : Exception
{
    public WrongValueException() : base("Es wurde ein falscher Wert erkannt!")
    {
    }

    public WrongValueException(string message) : base(message)
    {
    }

    public WrongValueException(string message, Exception innerException) : base(message, innerException)
    {
    }
}
```



[Zurück zur Startseite](../README.md)