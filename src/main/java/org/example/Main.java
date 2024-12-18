package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumberError {
        Scanner sc = new Scanner(System.in);
        String temp;
        int math = 0;

        do {
            double num1 = 0;
            double num2 = 0;
            int num2Int = 0;
            System.out.println("Möchtest du: ");
            System.out.println(" 1. Addieren \n 2. Subtrahieren \n 3. Multiplizieren \n 4. Dividieren \n 5. Quadratwurzel ziehen \n 6. Potenzieren \n :q! - Beenden");
            temp = sc.nextLine();
            if (temp.equals(":q!")) {
                break;
            } else {
                try {
                    math = Integer.parseInt(temp);

                    if (math<1 || math >6) {
                        System.out.println("Ungültige Eingabe. Bitte eine Zahl zwischen 1 und 6 eingeben.");
                        continue;
                    }
                    if (math<5) {
                        System.out.println("Gib die erste Zahl ein.");
                        num1 = Double.parseDouble(sc.nextLine());;
                        System.out.println("Gib die zweite Zahl ein.");
                        num2 = Double.parseDouble(sc.nextLine());
                    } else if (math == 5) {
                        System.out.println("Gib die Zahl ein, deren Quadratwurzel du ziehen möchtest.");
                        num1 = Double.parseDouble(sc.nextLine());
                    } else {
                        System.out.println("Gib die erste Zahl ein.");
                        num1 = Double.parseDouble(sc.nextLine());
                        System.out.println("Gib die zweite Zahl ein.");
                        num2Int = Integer.parseInt(sc.nextLine());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ungültige Eingabe. Bitte eine Zahl oder :q! eingeben.");
                    sc.nextLine();
                    continue;
                }
            }




            switch(math) {
                case 1:
                    System.out.println("\n" + num1 + " + " + num2 + " = " + Calculator.add(num1, num2) + "\n");
                    break;
                case 2:
                    System.out.println("\n" + num1 + " - " + num2 + " = " + Calculator.substract(num1, num2) + "\n");
                    break;
                case 3:
                    System.out.println("\n" + num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2) + "\n");
                    break;
                case 4:
                    System.out.println("\n" + num1 + " / " + num2 + " = " + Calculator.divide(num1, num2) + "\n");
                    break;
                case 5:
                    System.out.println("\n√" + num1 + " =  " + Calculator.squareRoot(num1) + "\n");
                    break;
                case 6:
                    System.out.println("\n" + num1 + " ^ " + num2 + " = " + Calculator.power(num1, num2Int));
            }

            sc.nextLine();
        } while (true);
        sc.close();
    }
}