package students.nikita_bortnikovs.lesson_5.homework.level_4;

import java.util.Arrays;

public class Task28 {
    public static void main(String[] args) {
        int arrLength = (int) (Math.random() * 100);
        int[] array = new int[arrLength];
        int i = 0;
        while (i < arrLength) {
            array[i] = (int) (Math.random() * 100);
            i++;
        }
        System.out.println(Arrays.toString(array));
        int minNum = array[0];
        for (int ii = 0; ii < arrLength; ii++) {
            if (array[ii] < minNum) {
                minNum = array[ii];
            }
        }
        System.out.println("Min number is = " + minNum);
    }

    }

