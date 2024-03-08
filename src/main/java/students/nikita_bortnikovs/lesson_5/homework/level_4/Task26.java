package students.nikita_bortnikovs.lesson_5.homework.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину масисва");
        int arrLength = scanner.nextInt();
        int[] array = new int[arrLength];
        int i = 0;
        while (i < arrLength) {
            array[i] = (int) (Math.random() * 100);
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
