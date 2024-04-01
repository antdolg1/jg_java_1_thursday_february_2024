package students.ruslan_k.lesson_5.level_5;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        if (arrayLength >= 0) {
            return new int[arrayLength];
        }
        System.out.println("Array Length can't be Negative");
        return new int[0];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

    }

}