package students.slava_subacius.lesson_5.level_2;

public class ArrayExampleThree {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        for (int i = 0; i < array.length; i++) {
            System.out.println("i " + array[i]);
        }
        for (int i = 0; i < 3; i++) {
            array[i] += 2;
            System.out.println("Значения после увеличения на 2: " + array[i]);

        }
    }
}
