package students.kristina_manevica.lesson_5.homework.level_4;

import java.util.Arrays;

class Task30 {
    public static void main(String[] args) {

        int[] arrays = new int[(int) (Math.random() * 10)];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }

        System.out.println("Array elements: " + Arrays.toString(arrays));

        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] % 2 != 0) {
                System.out.println("Odd elements: " + arrays[j]);
            }
        }
    }
}
