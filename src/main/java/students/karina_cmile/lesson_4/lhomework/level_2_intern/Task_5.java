package students.karina_cmile.lesson_4.lhomework.level_2_intern;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Please enter number x: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter number y: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is the biggest number");
        } else if (number1 < number2) {
            System.out.println(number2 + " is the biggest number");
        } else {
            System.out.println("Please enter the different numbers!");
        }
    }
}
