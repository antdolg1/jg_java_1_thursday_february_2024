package students.karina_cmile.lesson_4.lhomework.level_1_intern;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Please enter the integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive");
        } else if (number == 0) {
            System.out.println("Your number equals null");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        }
    }
}
