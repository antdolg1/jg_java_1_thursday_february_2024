package students.kristina_manevica.lesson_4.homework.level_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Enter int number:");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == 0) {
            System.out.println("It is zero!");
        } else if (userNumber % 2 == 0) {
            System.out.println("Even number!");
        } else if (userNumber % 2 != 0) {
            System.out.println("Odd number!");
        }
    }
}
