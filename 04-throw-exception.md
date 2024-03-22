# Exceptions selbst auswerfen

In bestimmten Fällen macht es Sinn, ohne dass ein grober Fehler im Programm aufgetreten ist, eine Exception auszuwerfen. 

Z.B. wollen wir überprüfen, in einem Objekt, ob die eingegebenen Werte dem erlaubten Wertebereich entsprechen. Wenn dies nicht der Fall ist, werfen wir eine Exception, die von der UI weiter behandelt wird, um dem\*der Benutzer\*in eine entsprechende aussagekräftige Fehlermeldung zu geben.

In den meisten Programmiersprachen wird mit dem Schlüsselwort `throw` und der Instanzierung einer neuen Exception (`new Exception`) eine Exception geworfen.

Hier ein Beispiel:

```java
// Java
import java.util.InputMismatchException;

public class Main {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // Set age to 15 (which is below 18...)
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

```csharp
// C# 
using System;

public class Main
{
    static void CheckAge(int age)
    {
        if (age < 18)
        {
            throw new ArgumentException("Access denied - You must be at least 18 years old.");
        }
        else
        {
            Console.WriteLine("Access granted - You are old enough!");
        }
    }

    public static void Main(string[] args)
    {
        try
        {
            CheckAge(15); // Set age to 15 (which is below 18...)
        }
        catch (ArgumentException e)
        {
            Console.WriteLine(e.Message);
        }
    }
}
```

[Zurück zur Startseite](README.md)