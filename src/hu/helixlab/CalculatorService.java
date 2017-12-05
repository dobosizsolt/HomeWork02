package hu.helixlab;

import java.util.Random;

//CalculatorService nevű osztály létrahozása.

public class CalculatorService {

    /**Létrehoztam egy isItEven nevű boolean típusú metódust,
     * melynek egy int típusú változót adtam bemeneti paraméterként.
     * Maradékos osztást használva a visszatérési értéke
     * true ha páros, illetve false ha páratlan*/

    public static boolean isItEven(int number){
        return number % 2 == 0;

    }


    /**Léterhoztam egy calculate nevű float típusú metódust,
     * aminek két int típusú és egy char típusú változót adtam bemeneti paraméterként.
     * Inicializáltam egy float típusú result nevű változót a metódus eredményének tárolására,
     * majd switch-case szerkezettel szétválasztottam az operation változót.*/

    public static float calculate(int x, int y, char operation) {
        float result = 0;
        switch(operation) {
            case '+' :
                result = x + y;
                break;
            case '-' :
                result = x - y;
                break;
            case '*' :
                result = x * y;
                break;
            case '/' :
                result = (float) x / y;
                break;
            default:
                System.out.println("Calculation error");
        }
        return result;
    }
}
