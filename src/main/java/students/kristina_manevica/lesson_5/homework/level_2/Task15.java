package students.kristina_manevica.lesson_5.homework.level_2;

class Task15 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
            System.out.println("Current element value is " + numbers[i]);
            numbers[i] += 2;
            System.out.println("New element value is " + numbers[i]);
        }
    }
}