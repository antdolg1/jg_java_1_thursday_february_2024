package students.igors_melkins.lesson_5.level_2;

import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) {

        int [] numbers = new int [3];
        int sum = 0;

        numbers [0] = (int) (Math.random() * 100);
        numbers [1] = (int) (Math.random() * 100);
        numbers [2] = (int) (Math.random() * 100);
        for (int i = 0;i < numbers.length;i++){
            sum += numbers[i];
        }
        int average = sum / numbers.length;
        System.out.println(Arrays.toString(numbers));
        System.out.println(average);
    }
}
