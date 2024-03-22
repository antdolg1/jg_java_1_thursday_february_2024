package students.karina_cmile.lesson_5.level_2_intern;

public class ArraySum {
    static int sumOfArrayNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


}
