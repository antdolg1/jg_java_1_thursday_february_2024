package students.nikola_korovacka.lesson_4;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ievadam ciparu
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        // Pārbaudam vai tas ir pozītīvs vai negatīvs
        if (number > 0) {
            System.out.println("Введенное число является положительным.");
        } else if (number < 0) {
            System.out.println("Введенное число является отрицательным.");
        }

    }
}
