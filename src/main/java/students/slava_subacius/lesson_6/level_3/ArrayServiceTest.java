package students.slava_subacius.lesson_6.level_3;


import java.util.Arrays;

public class ArrayServiceTest {

    public static void main(String[] args) {
        testContainsPositive();
        testContainsNegative();
        testCountOccurrencesPositive();
        testCountOccurrencesNegative();
        testReplaceFirstPositive();
        testReplaceFirstNegative();
        testRevert();
        testSortIntegers();

    }

    static void testContainsPositive() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int numberToSearch = 3;
        boolean result = arrayService.contains(array, numberToSearch);
        System.out.println("Test positive: " + result);
    }

    static void testContainsNegative() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int numberToSearch = 6;
        boolean result = arrayService.contains(array, numberToSearch);
        System.out.println("Test Negative: " + result);
    }

    static void testCountOccurrencesPositive() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 3};
        int numberToSearch = 3;
        int expectedResult = 2;
        int result = arrayService.countOccurrences(array, numberToSearch);
        System.out.println("Test positive: " + (result == expectedResult));
    }

    static void testCountOccurrencesNegative() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 3};
        int numberToSearch = 4;
        int expectedResult = 0;
        int result = arrayService.countOccurrences(array, numberToSearch);
        System.out.println("Test negative: " + (result == expectedResult));
    }

    static void testReplaceFirstPositive() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 3;
        int newNumber = 6;

        arrayService.replaceFirst(array, numberToReplace, newNumber);
        boolean result = arrayService.contains(array, numberToReplace);
        System.out.println("Test positive1: " + result);
    }

    static void testReplaceFirstNegative() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 6;
        int newNumber = 3;

        arrayService.replaceFirst(array, numberToReplace, newNumber);
        boolean result = arrayService.contains(array, numberToReplace);
        System.out.println("Test negative2: " + result);
    }

    static void testRevert() {
        ArrayService arrayService = new ArrayService();
        int[] arr1 = {1, 2, 3, 4, 5};
        arrayService.revert(arr1);
        int[] expectedArr = {5, 4, 3, 2, 1};
        boolean result = Arrays.equals(expectedArr, arr1);
        System.out.println("Test revert: " + result);
    }

    static void testSortIntegers() {
        ArrayService arrayService = new ArrayService();
        int[] array = {5, 3, 1, 4, 2};
        arrayService.sortIntegers(array);
        int[] expectedArray = {1, 2, 3, 4, 5};
        boolean result = Arrays.equals(expectedArray, array);
        System.out.println("Test sortIntegers: " + result);

    }
}


