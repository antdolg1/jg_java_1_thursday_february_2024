package students.slava_subacius.lesson_6.level_1;

public class TestIsEven {
    public static void main(String[] args) {
        testIsEvenForEvenNumber();
        testIsEvenForOddNumber();
        testIsEvenForZero();
        testIsEvenForNegativNumber();
    }

    public static void testIsEvenForEvenNumber() {
        NumberUtils numberUtils = new NumberUtils();
        boolean actualResult = numberUtils.isEven(4);
        boolean expectedResult = true;
        printTestResult(4, actualResult, expectedResult);
    }

    static void testIsEvenForOddNumber() {
        NumberUtils numberUtils = new NumberUtils();
        boolean actualResult = numberUtils.isEven(5);
        boolean expectedResult = false;
        printTestResult(5, actualResult, expectedResult);
    }

    static void testIsEvenForZero() {
        NumberUtils numberUtils = new NumberUtils();
        boolean actualResult = numberUtils.isEven(0);
        boolean expectedResult = true;
        printTestResult(0, actualResult, expectedResult);
    }

    static void testIsEvenForNegativNumber() {
        NumberUtils numberUtils = new NumberUtils();
        boolean actualResult = numberUtils.isEven(-3);
        boolean expectedResult = false;
        printTestResult(-3, actualResult, expectedResult);
    }

    static void printTestResult(int number, boolean actualResult, boolean expectedResult) {
        if (actualResult == expectedResult) {
            System.out.println("Test passed for: " + number);
        } else {
            System.out.println("Test failed for: " + number + ". Expected: " +
                    expectedResult + " but was: " + actualResult);
        }
    }
}




