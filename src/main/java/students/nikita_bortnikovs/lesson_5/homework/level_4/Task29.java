package students.nikita_bortnikovs.lesson_5.homework.level_4;

import java.util.Arrays;

public class Task29 {
    public static void main(String[] args) {
        int arrLength = (int) (Math.random() * 100);
        int[] array = new int[arrLength];
        int i = 0;
        while (i < arrLength) {
            array[i] = (int) (Math.random() * 100);
            i++;
        }
        System.out.println(Arrays.toString(array));
        int even = array[0];
        for (int ii = 0; ii < arrLength; ii++) {
            if (array[ii] % 2 == 0) {
                even = array[ii];
                System.out.println("Even number found in array is = " + even);
            }
        }
    }
}
