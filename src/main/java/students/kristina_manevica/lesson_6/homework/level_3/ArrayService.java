package students.kristina_manevica.lesson_6.homework.level_3;

public class ArrayService {

    public static boolean contains(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (numberToSearch == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static int countNumbersOccurrences(int[] array, int numberToCount) {
        int count = 0;
        for (int element : array) {
            if (element == numberToCount) {
                count++;
            }
        }
        return count;
    }

    public static boolean replaceFirstElement(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    public static boolean searchNumber(int[] array, int numberToSearch) {
        for (int arrayElement : array) {
            if (arrayElement == numberToSearch) {
                System.out.println("Number " + numberToSearch + " found in array.");
                return true;
            }
        }
        System.out.println("Negative test passed. No number " + numberToSearch + " in array.");
        return false;
    }

    public static int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int replacementCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                replacementCount++;
            }
        }
        return replacementCount;
    }

    public static void revertArray(int[] array) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (firstIndex < lastIndex) {
            int temporary = array[firstIndex];
            array[firstIndex] = array[lastIndex];
            array[lastIndex] = temporary;
            firstIndex++;
            lastIndex--;
        }
    }
}
