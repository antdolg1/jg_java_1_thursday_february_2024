package students.kristina_manevica.lesson_5.homework.level_5;

class ArrayUtil {

    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public static void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }
}
