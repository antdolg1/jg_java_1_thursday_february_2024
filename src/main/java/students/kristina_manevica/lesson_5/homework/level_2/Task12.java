package students.kristina_manevica.lesson_5.homework.level_2;


import java.util.Arrays;

class Task12 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
            System.out.println("Random element value is: " + numbers[i]);
        }

        System.out.println("Whole Array: " + Arrays.toString(numbers));
    }
}
