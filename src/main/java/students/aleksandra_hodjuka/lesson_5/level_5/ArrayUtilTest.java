package students.aleksandra_hodjuka.lesson_5.level_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {10, 5, 20, 8, 15}; // Пример массива

        int expectedMax = 20; // Максимальное число в массиве

        int actualMax = arrayUtil.findMaxNumber(array);

        if (actualMax == expectedMax) {
            System.out.println("Test shouldFindMaxNumber =  OK");
        } else {
            System.out.println("Test shouldFindMaxNumber = FAIL");
        }
    }
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {10, 5, 20, 8, 15}; // Пример массива

        int expectedMin = 5; // Максимальное число в массиве

        int actualMin = arrayUtil.findMinNumber(array);

        if (actualMin == expectedMin) {
            System.out.println("Test shouldFindMinNumber =  OK");
        } else {
            System.out.println("Test shouldFindMinNumber = FAIL");
        }
    }
    private void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 10; // Создание массива определенной длины

        // Вызов метода createArray для создания массива заданной длины
        int[] array = arrayUtil.createArray(arrayLength);

        // Проверяем, что создан массив и его длина соответствует ожидаемой
        if (array != null && array.length == arrayLength) {
            System.out.println("Test shouldCreateArray = OK");
        } else {
            System.out.println("Test shouldCreateArray = FAIL");
        }
    }
}
