package students.aleksandra_hodjuka.lesson_5.level_2;

public class Task_15App {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) numbers[i] += 2;
        }
        System.out.println("Увеличение значения элементов массива на 2");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }
    }
}

