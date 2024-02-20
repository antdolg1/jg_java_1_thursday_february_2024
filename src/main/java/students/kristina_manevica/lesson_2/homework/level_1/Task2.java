package students.kristina_manevica.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Please enter first double number, press Enter and then enter second double number!");

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        double sumResult = firstDoubleNumber + secondDoubleNumber;
        double subtractResult = firstDoubleNumber - secondDoubleNumber;
        double multiplyResult = firstDoubleNumber * secondDoubleNumber;
        double divisionResult = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Summation result: " + sumResult);
        System.out.println("Subtraction result: " + subtractResult);
        System.out.println("Multiplication result: " + multiplyResult);
        System.out.println("Division result is: " + divisionResult);
    }
}
