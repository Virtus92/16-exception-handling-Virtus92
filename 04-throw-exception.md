# Exceptions selbst auswerfen

In bestimmten Fällen macht es Sinn, ohne dass ein grober Fehler im Programm aufgetreten ist, eine Exception auszuwerfen. 

Z.B. wollen wir überprüfen, in einem Objekt, ob die eingegebenen Werte dem erlaubten Wertebereich entsprechen. Wenn dies nicht der Fall ist, werfen wir eine Exception, die von der UI weiter behandelt wird, um dem\*der Benutzer\*in eine entsprechende aussagekräftige Fehlermeldung zu geben.

In den meisten Programmiersprachen wird mit dem Schlüsselwort **throw** und der Instanzierung einer neuen Exception (**new Exception**) eine Exception geworfen.

## Java

Hier ein Beispiel:

```java
public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```


[Zurück zur Startseite](README.md)