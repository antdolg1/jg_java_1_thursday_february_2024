package students.slava_subacius.lesson_5.level_2;

import java.util.Random;

public class AverageValue {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);

            int sum = array[0] + array[1] + array[2];
            double average = (double) sum / array.length;
            System.out.println("Average value: " + average);

        }
    }
}
