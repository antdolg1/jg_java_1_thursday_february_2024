package students.nikita_bortnikovs.lesson_4.homework.level_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter  2 numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1);
        } else if (number1 == number2) {
            System.out.println("You entered same numbers");
        } else {
            System.out.println(number2);
        }
    }
}
