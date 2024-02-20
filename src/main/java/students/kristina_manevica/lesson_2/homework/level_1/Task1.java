package students.kristina_manevica.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Please enter first whole number, press Enter and then enter second whole number!");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        int divisionResult = firstNumber / secondNumber;

        System.out.println("Summation result: " + sumResult);
        System.out.println("Subtraction result: " + subtractResult);
        System.out.println("Multiplication result: " + multiplyResult);
        System.out.println("Division result is: " + divisionResult);
    }
}