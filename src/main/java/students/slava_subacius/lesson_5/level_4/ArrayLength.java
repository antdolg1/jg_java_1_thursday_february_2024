package students.slava_subacius.lesson_5.level_4;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива:");
        for (int i = 0; i < array.length; i++) {
            int numbers = array[i];
            System.out.print(numbers + " ");
        }
    }
}