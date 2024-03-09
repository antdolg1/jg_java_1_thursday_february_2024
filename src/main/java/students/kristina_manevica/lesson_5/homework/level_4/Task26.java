package students.kristina_manevica.lesson_5.homework.level_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);

        int[] arrays = new int[scanner.nextInt()];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 1000);
        }

        System.out.println("Array elements: " + Arrays.toString(arrays));
    }
}
