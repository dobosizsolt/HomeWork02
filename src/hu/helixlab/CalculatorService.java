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
}
