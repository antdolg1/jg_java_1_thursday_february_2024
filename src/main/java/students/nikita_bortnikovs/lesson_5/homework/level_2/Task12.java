package students.nikita_bortnikovs.lesson_5.homework.level_2;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = (int) (Math.random() * 100);
        numbers[1] = (int) (Math.random() * 100);
        numbers[2] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(numbers));
    }
}