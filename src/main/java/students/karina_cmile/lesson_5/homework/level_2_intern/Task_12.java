package students.karina_cmile.lesson_5.homework.level_2_intern;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        int number2;
        int number3;
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter number 2: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter number 3: ");
        numbers[2] = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value of cell " + i + " = " + numbers[i]);
        }
    }
}