package students.kristina_manevica.lesson_4.homework.level_2;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {

        System.out.println("Enter two int numbers:");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Biggest is: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Biggest is " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("Numbers are the same!");
        }
    }
}
