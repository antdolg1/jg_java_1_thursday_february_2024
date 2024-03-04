package students.slava_subacius.lesson_5.level_2;

import java.lang.reflect.Array;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        myArray[0] = 5;
        myArray[1] = 10;
        myArray[2] = 15;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(" i = " + myArray[i]);
        }
    }
}