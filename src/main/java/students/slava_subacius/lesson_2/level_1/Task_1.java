package students.slava_subacius.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction : " + sub);
        System.out.println("Multiplication : " + mult);
        System.out.println("Division : " + div);


    }
}
