package students.slava_subacius.lesson_5.level_4;

import java.util.Random;

public class OddArrayNumber {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(50);
            System.out.println(array[i] + " ");
        }
        System.out.println("Odd number in array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
