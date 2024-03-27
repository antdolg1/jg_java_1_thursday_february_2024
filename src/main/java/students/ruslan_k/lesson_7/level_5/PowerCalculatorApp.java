package students.ruslan_k.lesson_7.level_5;

import java.util.Scanner;

public class PowerCalculatorApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input example like \"a^b\" where \"a\" is double and \"b\" is int ");
        String userInput = scan.nextLine();
        String[] splitInput = userInput.split("\\^");
        double result = PowerCalculator.powerOf(Double.parseDouble(splitInput[0]), Integer.parseInt(splitInput[1]));
        System.out.println(result);
    }
}
