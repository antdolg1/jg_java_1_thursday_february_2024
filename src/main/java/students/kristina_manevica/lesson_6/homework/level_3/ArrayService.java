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
}
