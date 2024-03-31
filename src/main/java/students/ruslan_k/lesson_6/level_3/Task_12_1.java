package students.ruslan_k.lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int[] referenceArray = {1, 4, 1324, -674, 114, -63, 45, 12, 432, -1, 12, 4, 32, 1};
        int[] testArray = {1, 4, 1324, -674, 114, -63, 45, 12, 432, -1, 12, 4, 32, 1};

        boolean result = true;
        for (int testValue : testArray) {
            result = service.isExistInt(testArray, testValue) && result;
        }
        printResult(result, "Inside array");
        result = service.isExistInt(testArray, 1000);
        printResult(!result, "Not in array");
        result = compareTestExpect(service.countOf(testArray, 1), 2);
        printResult(result, "Count when exist in array ");
        result = compareTestExpect(service.countOf(testArray, 1000), 0);
        printResult(result, "Count when not exist in array ");
        result = service.replaceFirst(testArray, 114, 114);
        printResult(result, "Replace completed ");
        result = service.replaceFirst(testArray, 1000, 5);
        printResult(!result, "Replacement not completed");
        result = compareTestExpect(service.replaceAll(testArray, 4, 4), 2);
        printResult(result, "Replace All ");
        result = compareTestExpect(service.replaceAll(testArray, 1000, 4), 0);
        printResult(result, "Replace Nothing ");
        result = revertTest(testArray, referenceArray);
        printResult(result, "Array Revert ");
        result = sortArrayTest(testArray);
        printResult(result, "Array Sort ");

    }

    static void printResult(boolean condition, String testType) {
        if (condition) {
            System.out.println("Test " + testType + ": - Ok");
        } else {
            System.out.println("Test " + testType + ": - Failed");
        }
    }

    static boolean compareTestExpect(int result, int testValue) {
        return result == testValue;
    }

    static boolean revertTest(int[] array1, int[] refArray) {
        int lastIndex = array1.length - 1;
        ArrayService service = new ArrayService();
        service.arrayReverse(array1);
        for (int i = 0; i < array1.length; i++) {
            if (array1[lastIndex - i] != refArray[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean sortArrayTest(int[] sortArray) {
        ArrayService service = new ArrayService();
        service.bubbleSort(sortArray);
        for (int i = 0; i < sortArray.length - 1; i++) {
            if (sortArray[i] > sortArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
