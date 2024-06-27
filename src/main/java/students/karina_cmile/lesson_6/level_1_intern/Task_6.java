package students.karina_cmile.lesson_6.level_1_intern;

import java.util.Scanner;

class NumberUtils {
    public static boolean isEven(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
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
