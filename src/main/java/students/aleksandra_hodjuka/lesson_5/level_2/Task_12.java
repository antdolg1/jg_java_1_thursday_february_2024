package students.aleksandra_hodjuka.lesson_5.level_2;

public class Task_12 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 55);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }


    }
}
