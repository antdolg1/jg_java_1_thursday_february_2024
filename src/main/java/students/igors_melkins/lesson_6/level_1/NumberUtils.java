package students.igors_melkins.lesson_6.level_1;

import java.util.Scanner;

public class NumberUtils {
    public static boolean isEven(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        boolean even = NumberUtils.isEven(numbers);
        System.out.println("Number" + numbers + "is even " + even);
        NumberUtils.testIsEven(numbers,even);
    }
    private static void testIsEven(int number, boolean expectedResult) {
        boolean realResult = NumberUtils.isEven(number);
        System.out.println("Test with number :" + number);
        System.out.println("Expected result :" + expectedResult + "Actual result :" + realResult );
    }
}
