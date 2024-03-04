package students.slava_subacius.lesson_5.level_2;

import java.util.Random;


public class ArraysExampleTwo {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            myArray[i] = random.nextInt();
            System.out.println("Аrray cell - " + i + ": " + myArray[i]);
        }
    }
}


