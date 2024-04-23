package students.kristina_manevica.lesson_5.homework.level_2;


class Task14 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        int sum = 0;
        int result;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 1000);
            sum += numbers[i];
        }

        result = sum / numbers.length;

        System.out.println("Result is: " + result);
    }
}
