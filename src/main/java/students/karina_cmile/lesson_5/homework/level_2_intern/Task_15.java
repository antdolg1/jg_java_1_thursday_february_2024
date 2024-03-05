package students.karina_cmile.lesson_5.homework.level_2_intern;

import java.sql.SQLOutput;
import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Значение каждой ячейки:"+numbers[0]+" "+numbers[1]+" "+numbers[2]);

        int[] newNumbers = new int[3];
        int newNumbers1 = numbers[0] +2;
        int newNumbers2 = numbers[1] +2;
        int newNumbers3 = numbers[2] +2;

        System.out.println("Значение каждой ячейки:"+ newNumbers1+" "+ newNumbers2+" "+ newNumbers3);
        }
    }
