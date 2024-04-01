package students.nikola_korovacka.lesson_4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Введенное число является положительным.");
        } else if (number < 0) {
            System.out.println("Введенное число является отрицательным.");
        } else {
            System.out.println("Введенное число является нулем.");
        }

    }
}
