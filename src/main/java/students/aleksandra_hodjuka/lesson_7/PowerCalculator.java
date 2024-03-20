package students.aleksandra_hodjuka.lesson_7;

import java.util.Scanner;

class PowerCalculator {
    double numberToIncrease;
    int thePowerToRaise;


    public static void main(String[] args) {

        System.out.println("Пожалуйста введите число:");

        Scanner scanner = new Scanner(System.in);
        double numberToIncrease = scanner.nextDouble();

        System.out.println("Пожалуйста введите степень возведения:");
        int thePowerToRaise = scanner.nextInt();

        double poweredNumber = 1;
        if (thePowerToRaise >= 0) {
            for (int i = 0; i < thePowerToRaise; i++) {
                poweredNumber *= numberToIncrease;
            }
            System.out.println("Результат возведения в степень :" + poweredNumber);


        }
    }
}
