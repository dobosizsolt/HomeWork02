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

    public static String generateRandomNum() {

        /**Létrehoztam egy string típusú metódust, amiben
         * deklaráltam egy float és egy string változót.
         * nextFloat metódussal generáltam 0 és 1 között egy számot majd
         * 25-tel megszoroztam és hozzáadtam 25-öt, így beállítottam
         * a 25 - 50 intervallumot. If-fel megvizsgáltam, hogy a generatedNum
         * változóban lévő érték megegyezik-e az int-té kasztolt értékével.*/

        Random generator = new Random();

        float generatedNum;
        String result1;

        generatedNum = generator.nextFloat() * 25 + 25;

        if (generatedNum == (int) generatedNum) {
            result1 = ("\nA " + generatedNum + " generált szám egész");
        }
        else {
            result1 = ("\nA " + generatedNum + " generált szám nem egész");
        }
        return result1;
    }

    public static String generatedRandomNumbers() {

        /**Az előzőek alapján deklaráltam a változókat majd egy
         * if szerkezettel logikai operátorokkal megvizsgáltam a
         * generált számokat és kiírattam konzolra.*/

        Random generator1 = new Random();

        int generatedNumber1;
        int generatedNumber2;
        double poweredNumber;
        String result2;

        generatedNumber1 = generator1.nextInt(51) + 100;
        generatedNumber2 = generator1.nextInt(51) + 100;

        if ((generatedNumber1 > generatedNumber2 && generatedNumber1 % 2 == 0) || (generatedNumber1 < generatedNumber2 && generatedNumber1 % 2 == 1)) {
            result2 = ("\nAz első szám: " + generatedNumber1);
        }
        else if (generatedNumber2 > generatedNumber1 && generatedNumber2 % 2 == 1) {
            result2 = ("\nA második szám: " + generatedNumber2);
        }
        else {
            poweredNumber = Math.pow(generatedNumber1, generatedNumber2);
            result2 = ("\nA két szám hatványa: ");
        }
        return result2;
    }
}
