package students.nikita_bortnikovs.lesson_5.homework.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Впишите длину массива");
        int arrLenght = scanner.nextInt();
        int[] array = new int[arrLenght];
        int i = 0;
        while (i < arrLenght) {
            System.out.println("Впишите значение  массива");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
