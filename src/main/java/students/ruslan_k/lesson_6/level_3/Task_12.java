package students.ruslan_k.lesson_6.level_3;

class ArrayService {
    boolean isExistInt(int[] array, int intToFind) {
        for (int arrayElement : array) {
            if (arrayElement == intToFind) {
                return true;
            }
        }
        return false;
    }

    int countOf(int[] array, int intToCount) {
        int counter = 0;
        for (int arrayElement : array) {
            if (arrayElement == intToCount) {
                counter++;
            }
        }
        return counter;
    }

    boolean replaceFirst(int[] array, int toReplace, int replaceWith) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toReplace) {
                array[i] = replaceWith;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int toReplace, int replaceWith) {
        int replaceCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toReplace) {
                array[i] = replaceWith;
                replaceCounter++;
            }
        }
        return replaceCounter;
    }

    void arrayReverse(int[] array) {
        int tempValue;
        int last = array.length - 1;
        int first = 0;
        while (first < last) {
            tempValue = array[first];
            array[first] = array[last];
            array[last] = tempValue;
            first++;
            last--;
        }
    }

    void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
