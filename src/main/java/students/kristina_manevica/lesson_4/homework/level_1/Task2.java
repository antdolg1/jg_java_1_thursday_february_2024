package students.kristina_manevica.lesson_4.homework.level_1;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter any int number:");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber > 0) {
            System.out.println("Number is positive!");
        } else if (userNumber < 0) {
            System.out.println("Number is negative!");
        } else if (userNumber == 0) {
            System.out.println("It is zero, learn math!");
        }
    }
}
