package students.nikita_bortnikovs.lesson_4.homework.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Please enter  3 numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing ");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
