package students.karina_cmile.lesson_5.level_2_intern;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
               int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
//        System.out.println(numbers[0]+" "+numbers[1]+" "+numbers[2]);

            int sum = ArraySum.sumOfArrayNumbers(numbers);
            System.out.println("Сумма всех чисел массива равна " + sum);
        }
    }