package students.aleksandra_hodjuka.lesson_5.level_4;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
