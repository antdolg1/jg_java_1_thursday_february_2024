package students.nikita_bortnikovs.lesson_5.homework.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        numbers[0] = scanner.nextInt();
        System.out.println("Введите второе число");
        numbers[1] = scanner.nextInt();
        System.out.println("Введите второе число");
        numbers[2] = scanner.nextInt();
        System.out.println(Arrays.toString(numbers));
    }
}
