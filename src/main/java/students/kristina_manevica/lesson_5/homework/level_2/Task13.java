package students.kristina_manevica.lesson_5.homework.level_2;


class Task13 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
            sum = sum + numbers[i];
        }

        System.out.println("Sum of all three values: " + sum);
    }
}
