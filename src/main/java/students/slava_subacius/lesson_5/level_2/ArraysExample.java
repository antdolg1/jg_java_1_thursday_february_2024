package students.slava_subacius.lesson_5.level_2;

import java.util.Random;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            myArray[i] = scanner.nextInt();
            System.out.println("Аrray cell - " + i + ": " + myArray[i]);
        }
    }
}
