package students.kristina_manevica.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        System.out.println("Enter please three whole number:");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int sumOfNumbers = firstNumber + secondNumber + thirdNumber;
        double average = sumOfNumbers / 3;

        System.out.println("Average is: " + average);
    }
}
