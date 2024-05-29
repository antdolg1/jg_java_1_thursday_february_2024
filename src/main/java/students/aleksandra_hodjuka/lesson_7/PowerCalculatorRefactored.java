package students.aleksandra_hodjuka.lesson_7;

import java.util.Scanner;

public class PowerCalculatorRefactored {
    public static void main(String[] args) {
        double numberToIncrease = getNumberFromUser("Пожалуйста введите число:");
        int thePowerToRaise = (int) getNumberFromUser("Пожалуйста введите степень возведения:");
        double poweredNumber = calculatePower(numberToIncrease, thePowerToRaise);
        printResult(poweredNumber);
    }

    private static double getNumberFromUser(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double calculatePower(double base, int exponent) {
        double result = 1;
        int absExponent = Math.abs(exponent);
        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }
        return exponent < 0 ? 1 / result : result;
    }

    private static void printResult(double result) {
        System.out.println("Результат возведения в степень: " + result);
    }

}
