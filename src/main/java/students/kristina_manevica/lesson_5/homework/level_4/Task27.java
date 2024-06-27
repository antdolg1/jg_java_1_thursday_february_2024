package students.kristina_manevica.lesson_5.homework.level_4;

import java.util.Arrays;

class Task27 {
    public static void main(String[] args) {

        int arrayLength = ArrayUtil.createArrayRandomLength();
        int[] array = ArrayUtil.createArray(arrayLength);
        ArrayUtil.fillArrayWithRandomNumbers(array);
        ArrayUtil.printArrayToConsole(array);
        ArrayUtil.findMaxNumber(array);
    }
}

        /* //previous solution

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(arrays));

        int maxNumber = arrays[0];
        for (int j = 0; j < arrays.length; j++) {
            if (maxNumber < arrays[j]) {
                maxNumber = arrays[j];
            }
        }*/