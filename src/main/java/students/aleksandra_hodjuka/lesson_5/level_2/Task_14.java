package students.aleksandra_hodjuka.lesson_5.level_2;

public class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 55);
        }
        int sum = 0;
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            average = sum / numbers.length;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }
        System.out.println(" Cреднее значение  " + average);
    }

}
