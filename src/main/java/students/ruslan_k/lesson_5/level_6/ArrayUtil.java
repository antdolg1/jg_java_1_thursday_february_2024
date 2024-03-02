package students.ruslan_k.lesson_5.level_6;

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        for (int result : array) {
            System.out.println(result);
        }
    }

    public int findMaxNumber(int[] array) {
        if (array.length != 0) {
            int result = array[0];
            for (int currentItem : array) {
                if (result < currentItem) {
                    result = currentItem;
                }
            }
            return result;
        } else {
            System.out.println("It's Zero-Length array");
            return -1;
        }
    }

    public int findMinNumber(int[] array) {
        if (array.length != 0) {
            int result = array[0];
            for (int currentItem : array) {
                if (result > currentItem) {
                    result = currentItem;
                }
            }
            return result;
        } else {
            System.out.println("It's Zero-Length array");
            return -1;
        }
    }
}
