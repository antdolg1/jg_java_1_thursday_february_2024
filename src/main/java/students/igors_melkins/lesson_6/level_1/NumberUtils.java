package students.igors_melkins.lesson_6.level_1;

import java.util.Scanner;

public class NumberUtils {


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean even = NumberUtils.isEven(number);
        System.out.println("Number " + number + " is even? " + even);
        NumberUtils.testIsEven(number, even);

    }

    public static void testIsEven (int number, boolean expectedResult){
        boolean realResult = NumberUtils.isEven(number);
        System.out.println("Test with number: " + number);
        System.out.println("Expected result: " + expectedResult + ", Actual result: " + realResult);
    }
}

