package students.nikola_korovacka.lesson_10.level1_task2;


public class Main {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtilImpl();

        int[] array = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);

        int max = arrayUtil.findMaxNumber(array);
        int min = arrayUtil.findMinNumber(array);

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}