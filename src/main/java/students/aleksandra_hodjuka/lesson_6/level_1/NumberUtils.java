package students.aleksandra_hodjuka.lesson_6.level_1;

class NumberUtils {

    int number;

    public static boolean isEven(int number) {
        return number % 2 == 0;

    }

    public static void testisEvenWithNegativeEvenNumber() {
        int number = -6;
        boolean expected = true;
        boolean result = isEven(number);
        printTestResult("Negative Even Number", expected, result);

    }

    public static void testisEvenWithZero() {
        int number = 0;
        boolean expected = true;
        boolean result = isEven(number);
        printTestResult("Zero", expected, result);

    }

    public static void testisEvenWithNegativeOddNumber() {
        int number = -3;
        boolean expected = false;
        boolean result = isEven(number);
        printTestResult("Negative Odd Number", expected, result);

    }

    public static void testisEvenWithEvenNumber() {
        int number = 4;
        boolean expected = true;
        boolean result = isEven(number);
        printTestResult("Positive Even Number", expected, result);

    }

    public static void testIsEvenWithOddNumber() {
        int number = 7;
        boolean expected = false;
        boolean result = isEven(number);
        printTestResult("Positive Odd Number", expected, result);
    }

    private static void printTestResult(String testName, boolean expected, boolean result) {
        if (expected == result) {
            System.out.println(testName + ": Test passed");
        } else {
            System.out.println(testName + ": Test failed (Expected " + expected + " but got " + result + ")");
        }
    }

    public static void main(String[] args) {
        testisEvenWithNegativeEvenNumber();
        testisEvenWithZero();
        testisEvenWithNegativeOddNumber();
        testisEvenWithEvenNumber();
        testIsEvenWithOddNumber();
    }
}