package students.karina_cmile.lesson_4.lhomework.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Please enter the integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number == 0) {
            System.out.println("Please enter another integer number: ");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        }
    }


}
