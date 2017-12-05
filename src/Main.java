import hu.helixlab.CalculationHelper;
import hu.helixlab.CalculatorService;

public class Main {

    //Önellenőrzés végett készítettem.

    public static void main(String[] args) {

        System.out.println(CalculatorService.isItEven(7));
        System.out.println(CalculatorService.isItEven(8));

        System.out.println("\nEredmény: " + CalculationHelper.calc());

        System.out.println(CalculatorService.generateRandomNum());

    }
}
