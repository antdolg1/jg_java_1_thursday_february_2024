package students.kristina_manevica.lesson_5.homework.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);

        int[] arrays = new int[scanner.nextInt()];

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter element value with index: " + i);
            arrays[i] = scanner.nextInt();
        }
        System.out.println("All array elements: " + Arrays.toString(arrays));
    }
}
