package hu.helixlab;

import java.util.Scanner;

//CalculationHelper nevű osztály létrehozása.

public class CalculationHelper {

    /**Létrehoztam egy float típusú metódust,
     * amiben deklaráltam 2 int, 1 char és 1 float típusú változót.
     * A Scanner osztály nextInt metódusának segítségével
     * konzolról bekértem a két számot és egy charAt metódussal stringként
     * beolvastam a műveleti jelet. Majd a result változót inicializáltam
     * a CalculateService osztály calculate metódusának eredményével és
     * ezt beállítottam visszatérési értéknek.*/

    public static float calc() {

        int x;
        int y;
        char operation;
        float result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nOutput:\n");
        System.out.println("Adja meg x-et: ");
        x = scanner.nextInt();

        System.out.println("Adja meg y-t: ");
        y = scanner.nextInt();

        System.out.println("Adja meg a műveletet: ");
        operation = scanner.next().charAt(0);

        result = CalculatorService.calculate(x,y,operation);
        return result;
    }
}
