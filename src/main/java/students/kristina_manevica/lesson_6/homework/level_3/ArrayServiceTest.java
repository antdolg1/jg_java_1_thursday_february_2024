package students.kristina_manevica.lesson_6.homework.level_3;

import java.util.Arrays;

public class ArrayServiceTest {

    private static final int numberToSearch = 6;
    public static final int newNumber = 123;
    private static final int[] arrayOne = {0, 7, 2345, 6, 654, -4, 6};
    private static final int[] arrayOneBeforeChange = {0, 7, 2345, 6, 654, -4, 6};
    private static final int[] arrayTwo = {0, 7, 2345, 654, -4, 0};
    private static final boolean expectedResultPositive = true;
    private static final boolean expectedResultNegative = false;
    private static final int expectedCountResultOne = 2;
    private static final int expectedCountResultTwo = 0;

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainNumber();
        test.countNumbersOccurrences();
        test.shouldReplaceFirstOccurrence();
    }

    public void shouldContainNumber() {
        boolean actualResultPositive = ArrayService.contains(arrayOne, numberToSearch);
        System.out.println(actualResultPositive == expectedResultPositive ? "Positive test passed. Found number: " +
                actualResultPositive : "Error!");

        boolean actualResultNegative = ArrayService.contains(arrayTwo, numberToSearch);
        System.out.println(actualResultNegative == expectedResultNegative ? "Negative test passed. Found number: " +
                actualResultNegative : "Error!");
    }

    public void countNumbersOccurrences() {
        int actualResultPositive = ArrayService.countNumbersOccurrences(arrayOne, numberToSearch);
        System.out.println(actualResultPositive == expectedCountResultOne ? "Positive test passed. Number count: " +
                actualResultPositive : "Error!");

        int actualResultNegative = ArrayService.countNumbersOccurrences(arrayTwo, numberToSearch);
        System.out.println(actualResultNegative == expectedCountResultTwo ? "Negative test passed. Number count: " +
                actualResultNegative : "Error!");
    }

    public boolean shouldReplaceFirstOccurrence() {
        ArrayService.replaceFirstElement(arrayOne, numberToSearch, newNumber);
        System.out.println(Arrays.equals(arrayOne, arrayOneBeforeChange) ? "Error! Arrays equal." : "Positive test " +
                "passed. First occurrence of number " + numberToSearch + " replaced with " + newNumber);

        ArrayService.replaceFirstElement(arrayTwo, numberToSearch, newNumber);
        for (int arrayElement : arrayTwo) {
            if (arrayElement != numberToSearch) {
                return false;
            }
        }
        System.out.println("Negative test passed. No number " + numberToSearch + " in array: ");
        return true;
    }
}
