package students.nikita_bortnikovs.lesson_4.homework.level_3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Please enter  3 numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number2 != number3 && number3 != number1) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
