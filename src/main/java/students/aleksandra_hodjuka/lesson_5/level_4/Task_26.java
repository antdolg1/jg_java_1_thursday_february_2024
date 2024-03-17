package students.aleksandra_hodjuka.lesson_5.level_4;

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }
    }
}
