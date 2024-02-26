package students.karina_cmile.lesson_4.lhomework.level_1_intern;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
