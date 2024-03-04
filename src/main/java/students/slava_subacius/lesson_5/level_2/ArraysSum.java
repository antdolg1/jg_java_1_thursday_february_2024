package students.slava_subacius.lesson_5.level_2;


import java.util.Arrays;
import java.util.Random;

public class ArraysSum {
    public static void main(String[] args) {

        int[] array = new int[3];
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(50);
           sum += array[i];


            System.out.println("Сумма всех чисел массива равна " + sum);
        }
    }
}
