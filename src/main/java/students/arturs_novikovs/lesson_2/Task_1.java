package students.arturs_novikovs.lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Mult: " + mult);
        System.out.println("Div: " + div);
    }
}
