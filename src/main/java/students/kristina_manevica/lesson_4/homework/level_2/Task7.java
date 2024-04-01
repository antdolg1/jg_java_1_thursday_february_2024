package students.kristina_manevica.lesson_4.homework.level_2;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter two int numbers:");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println((firstNumber == secondNumber) ? "Numbers are equals" : "Numbers are different");
    }
}
