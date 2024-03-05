package students.karina_cmile.lesson_5.homework.level_2_intern;

import teacher.lesson_5.lessoncode.CustomArrayUtils;

import java.sql.SQLOutput;
import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        int length = 3;
        int[] numbers = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(100);
        }
//        System.out.println(numbers[0]+" "+numbers[1]+" "+numbers[2]);

            int sum = ArraySum.sumOfArrayNumbers(numbers);
            System.out.println("Сумма всех чисел массива равна " + sum);
        }
    }
