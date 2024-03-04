package students.nikita_bortnikovs.lesson_4.homework.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Please enter  3 numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println(number3);
        } else {
            System.out.println("Something went wrong");
        }
    }
}
