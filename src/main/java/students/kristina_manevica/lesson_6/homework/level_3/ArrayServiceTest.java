package students.kristina_manevica.lesson_6.homework.level_3;

import java.util.Arrays;

public class ArrayServiceTest {

    private final int numberToSearch = 6;
    public final int newNumber = 123;
    private final int[] arrayOne = {0, 7, 2345, 6, 654, -4, 6};
    private final int[] arrayTwo = {0, 7, 2345, 654, -4, 0};
    private final boolean expectedResultPositive = true;
    private final boolean expectedResultNegative = false;
    private final int expectedCountResultOne = 2;
    private final int expectedCountResultTwo = 0;

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainNumber();
        test.countNumbersOccurrences();
        test.shouldReplaceFirstOccurrence();
        test.shouldReplaceAll();
        test.shouldRevertArray();
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

    public void shouldReplaceFirstOccurrence() {
        int[] arrayOneBeforeChange = {0, 7, 2345, 6, 654, -4, 6};

        ArrayService.replaceFirstElement(arrayOne, numberToSearch, newNumber);
        System.out.println(Arrays.equals(arrayOne, arrayOneBeforeChange) ? "Error! Arrays equal." : "Positive test " +
                "passed. First occurrence of number " + numberToSearch + " replaced with " + newNumber);

        ArrayService.replaceFirstElement(arrayTwo, numberToSearch, newNumber);
        ArrayService.searchNumber(arrayTwo, numberToSearch);
    }

    public void shouldReplaceAll() {
        int[] array = {0, 7, 2345, 6, 654, -4, 6};
        int replacementCount = 2;

        int actualResultPositive = ArrayService.replaceAll(array, numberToSearch, newNumber);
        System.out.println(actualResultPositive == expectedCountResultOne ? "Positive test passed. Number " +
                numberToSearch + " is replaced for " + replacementCount + " times" : "Error!");

        int actualResultNegative = ArrayService.replaceAll(arrayTwo, numberToSearch, newNumber);
        System.out.println(actualResultNegative != expectedCountResultOne ? "Negative test passed. No number " +
                numberToSearch + " in array!" : "Error!");
    }

    public void shouldRevertArray() {
        int[] arrayToRevert = {6, -4, 654, 6, 2345, 7, 0};
        int[] revertedArrayCopy = {0, 7, 2345, 6, 654, -4, 6};

        ArrayService.revertArray(arrayToRevert);
        System.out.println(Arrays.equals(arrayToRevert, revertedArrayCopy) ? "Test passed. Array is reverted." :
                "Error!");
    }


}
