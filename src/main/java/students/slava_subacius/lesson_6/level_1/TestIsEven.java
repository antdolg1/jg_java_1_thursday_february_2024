package students.slava_subacius.lesson_6.level_1;

import java.util.Random;

public class TestIsEven {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Number: " + number + " is even: " + numberUtils.isEven(number));
    }
}
