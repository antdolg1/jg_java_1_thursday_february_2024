package students.kristina_manevica.lesson_5.homework.level_4;

class Task26 {
    public static void main(String[] args) {

        int arrayLength = ArrayUtil.getArrayLengthFromUser();
        int[] array = ArrayUtil.createArray(arrayLength);

        ArrayUtil.fillArrayWithRandomNumbers(array);
        ArrayUtil.printArrayToConsole(array);
    }
}
