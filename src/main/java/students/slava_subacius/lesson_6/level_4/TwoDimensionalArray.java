package students.slava_subacius.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        int sum = 0;
        System.out.println("Two Dimensional Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all numbers in a two-dimensional array: " + sum);
    }
}
