package teacher.lesson_6.lessoncode;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {

        Random random = new Random();

        //returns a random int
        int randomNumber = random.nextInt();
        System.out.println("Random number: " + randomNumber);

        //return a random int value between 0 (inclusive) and the specified value (exclusive)
        int randomNumberWithLimit = random.nextInt(11);
        System.out.println("Random number with limit: " + randomNumberWithLimit);

        double randomDouble = random.nextDouble();

        boolean randomBoolean = random.nextBoolean();

    }
}
