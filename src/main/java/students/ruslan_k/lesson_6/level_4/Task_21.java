package students.ruslan_k.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[10][20];
        long result;
        fillTwoDimArray(array);
        result = sumOfElements(array);
        System.out.println("Sum of all elements 2D array is : " + result);

    }

    static void fillTwoDimArray(int[][] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rnd.nextInt();
            }
        }
    }

    static long sumOfElements(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result += array[i][j];
            }
        }
        return result;
    }
}
