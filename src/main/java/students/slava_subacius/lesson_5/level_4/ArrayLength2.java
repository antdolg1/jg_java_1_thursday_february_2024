package students.slava_subacius.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class ArrayLength2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        Random random = new Random();
        System.out.println("Случайные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i] + " ");

        }
    }
}
