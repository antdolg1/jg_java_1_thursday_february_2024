package students.kristina_manevica.lesson_5.homework.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        System.out.println("Enter three int numbers:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println("Element value is: " + numbers[i]);
        }

        System.out.println("Whole Array: " + Arrays.toString(numbers));
    }
}
