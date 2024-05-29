package students.aleksandra_hodjuka.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReturnPositiveNumber();
        test.testContainsEmptyArray();
        test.testCountOccurrences_PositiveScenario();
        test.testCountOccurrences_NegativeScenario();
        test.testCountOccurrences_EmptyArray();
        test.testCountOccurrences_SeveralOccurrences();
        test.testReplaceFirstOccurrence();
        test.testReplaceFirstOccurrence_NotFound();
        test.testReplaceFirstOccurrence_MultipleOccurrences();
        test.testReplaceAll();
        test.testReplaceAll_NotFound();
        test.testSort();
        test.testSort_EmptyArray();
        test.testSort_SingleElementArray();
        test.testSort_AlreadySortedArray();
        test.testSort_NegativeNumbers();
        testReverse();

    }

    public void shouldReturnPositiveNumber() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 3, 5};
        int numberToSearch = 1;
        boolean realResult = ArrayService.contains(array, numberToSearch);
        boolean expectedResult = true;

        if (realResult == expectedResult) {
            System.out.println(numberToSearch + " = Данное число есть в массиве! - Passed");
        } else {
            System.out.println(numberToSearch + " = Данного числа нет в массиве! - Failed");
        }
    }

    public void testContainsEmptyArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {};
        int numberToSearch = 2;
        boolean realResult = ArrayService.contains(array, numberToSearch);
        boolean expectedResult = false;

        if (realResult == expectedResult) {
            System.out.println(numberToSearch + " - Тест на поиск числа в пустом массиве = Passed");
        } else {
            System.out.println(numberToSearch + " - Тест на поиск числа в пустом массиве = Failed");
        }
    }

    public void testCountOccurrences_PositiveScenario() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 3, 5};
        int numberToSearch = 3;
        int realResult = ArrayService.countOccurrences(array, numberToSearch);
        int expectedResult = 2;

        if (realResult == expectedResult) {
            System.out.println("Результат теста позитивного сценария: Passed");
        } else {
            System.out.println("Результат теста позитивного сценария: Failed");
        }
    }

    public void testCountOccurrences_NegativeScenario() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 3, 5};
        int numberToSearch = 10;
        int realResult = ArrayService.countOccurrences(array, numberToSearch);
        int expectedResult = 0;

        if (realResult == expectedResult) {
            System.out.println("Результат теста негативного сценария: Passed");
        } else {
            System.out.println("Результат теста негативного сценария: Failed");
        }
    }

    public void testCountOccurrences_EmptyArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {};
        int numberToSearch = 1000;
        int realResult = ArrayService.countOccurrences(array, numberToSearch);
        int expectedResult = 0;

        if (realResult == expectedResult) {
            System.out.println("Результат теста сценария пустого массива: Passed");
        } else {
            System.out.println("Результат теста сценария пустого массива: Failed");
        }
    }

    public void testCountOccurrences_SeveralOccurrences() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 3, 5};
        int numberToSearch = 3;
        int realResult = ArrayService.countOccurrences(array, numberToSearch);
        int expectedResult = 2;

        if (realResult == expectedResult) {
            System.out.println("Результат теста подсчета количества появления числа в массиве: Passed");
        } else {
            System.out.println("Результат теста подсчета количества появления числа в массиве: Failed");
        }
    }

    public void testReplaceFirstOccurrence() {
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 3;
        int newNumber = 7;

        ArrayService.replaceFirst(array, numberToReplace, newNumber);

        // Проверяем, что первое вхождение числа 3 было заменено на 7
        if (array[2] == 7) {
            System.out.println("Тест замены первого вхождения : Passed.");
        } else {
            System.out.println("Тест замены первого вхождения : Failed.");
        }
    }

    public void testReplaceFirstOccurrence_NotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 6; // Числа 6 нет в массиве
        int newNumber = 7;

        // Сохраняем копию массива для сравнения
        int[] originalArray = Arrays.copyOf(array, array.length);

        // Вызываем метод замены первого вхождения числа
        ArrayService.replaceFirst(array, numberToReplace, newNumber);

        // Проверяем, что числа 6 нет в массиве и массив остался неизменным
        if (Arrays.equals(array, originalArray)) {
            System.out.println("Тест на замену отсутствующего числа : Passed.");
        } else {
            System.out.println("Тест на замену отсутствующего числа : Failed.");
        }
    }

    public void testReplaceFirstOccurrence_MultipleOccurrences() {
        int[] array = {1, 2, 3, 3, 4, 5};
        int numberToReplace = 3; // Есть два вхождения числа 3 в массиве
        int newNumber = 7;

        // Сохраняем копию массива для сравнения
        int[] originalArray = Arrays.copyOf(array, array.length);

        // Вызываем метод замены первого вхождения числа
        ArrayService.replaceFirst(array, numberToReplace, newNumber);

        // Проверяем, что только первое вхождение числа 3 было заменено на 7
        if (array[2] == 7) {
            System.out.println("Тест на замену первого вхождения числа : Passed.");
        } else {
            System.out.println("Тест на замену первого вхождения числа : Failed.");
        }

        // Проверяем, что второе вхождение числа 3 осталось без изменений
        if (array[3] == originalArray[3]) {
            System.out.println("Тест на сохранение второго вхождения числа : Passed.");
        } else {
            System.out.println("Тест на сохранение второго вхождения числа : Failed.");
        }
    }

    public void testReplaceAll() {
        int[] array = {1, 1, 3, 3, 5};
        int numberToReplace = 3;
        int newNumber = 7;

        // Сохраняем копию массива для сравнения
        int[] originalArray = Arrays.copyOf(array, array.length);

        // Вызываем метод замены всех вхождений числа
        ArrayService.replaceAll(array, numberToReplace, newNumber);

        // Проверяем, что все вхождения числа 3 были заменены на 7
        boolean allReplaced = true;
        for (int i = 0; i < array.length; i++) {
            if (originalArray[i] == numberToReplace && array[i] != newNumber) {
                allReplaced = false;
                break;
            }
        }
        // Проверяем, что массив содержит только новые числа на месте замененных
        // и остальные элементы остались без изменений
        boolean noOldNumberLeft = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                noOldNumberLeft = false;
                break;
            }
        }
        if (allReplaced) {
            System.out.println("Тест на замену всех вхождений числа : Passed.");
        } else {
            System.out.println("Тест на замену всех вхождений числа : Failed.");
        }
    }

    public void testReplaceAll_NotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 6; // Числа 6 нет в массиве
        int newNumber = 7;

        // Сохраняем копию массива для сравнения
        int[] originalArray = Arrays.copyOf(array, array.length);

        // Вызываем метод замены всех вхождений числа
        ArrayService.replaceAll(array, numberToReplace, newNumber);

        // Проверяем, что числа 6 нет в массиве и массив остался неизменным
        if (Arrays.equals(array, originalArray)) {
            System.out.println("Тест на замену отсутствующего числа : Passed.");
        } else {
            System.out.println("Тест на замену отсутствующего числа  : Failed.");
        }
    }

    public void testSort() {
        int[] array = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};

        // Сортируем массив
        ArrayService.sort(array);

        // Проверяем, что массив отсортирован и соответствует ожидаемому результату
        if (Arrays.equals(array, expected)) {
            System.out.println("Тест на сортировку массива : Passed.");
        } else {
            System.out.println("Тест на сортировку массива : Failed.");
        }
    }

    public void testSort_EmptyArray() {
        int[] array = {};
        int[] expected = {};

        // Сортируем пустой массив
        ArrayService.sort(array);

        // Проверяем, что массив остался пустым после сортировки
        if (Arrays.equals(array, expected)) {
            System.out.println("Тест на сортировку пустого массива : Passed.");
        } else {
            System.out.println("Тест на сортировку пустого массива : Failed.");
        }
    }

    public void testSort_SingleElementArray() {
        int[] array = {1};
        int[] expected = {1};

        // Сортируем массив из одного элемента
        ArrayService.sort(array);

        // Проверяем, что массив остался с одним элементом после сортировки
        if (Arrays.equals(array, expected)) {
            System.out.println("Тест на сортировку массива из одного элемента : Passed.");
        } else {
            System.out.println("Тест на сортировку массива из одного элемента : Failed.");
        }
    }

    public void testSort_AlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        // Сортируем уже отсортированный массив
        ArrayService.sort(array);

        // Проверяем, что массив остался неизменным после сортировки
        if (Arrays.equals(array, expected)) {
            System.out.println("Тест на сортировку уже отсортированного массива : Passed.");
        } else {
            System.out.println("Тест на сортировку уже отсортированного массива : Failed.");
        }
    }

    public void testSort_NegativeNumbers() {
        int[] array = {-5, -3, -8, -4, -2};
        int[] expected = {-8, -5, -4, -3, -2};

        // Сортируем массив с отрицательными числами
        ArrayService.sort(array);

        // Проверяем, что массив был отсортирован в правильном порядке
        if (Arrays.equals(array, expected)) {
            System.out.println("Тест на сортировку массива с отрицательными числами : Passed.");
        } else {
            System.out.println("Тест на сортировку массива с отрицательными числами : Failed.");
        }
    }

    public static void testReverse() {
        // Инициализация исходного массива
        int[] array = {1, 2, 3, 4, 5, 6};

        // Ожидаемый массив после разворота
        int[] expectedArray = {6, 5, 4, 3, 2, 1};

        // Вызов метода для разворота массива
        ArrayService.reverse(array);

        // Проверка, что результат соответствует ожиданиям
        if (arraysAreEqual(expectedArray, array)) {
            System.out.println("Тест на разворот массива: Passed.");
        } else {
            System.out.println("Тест на разворот массива: Failed.");
        }
    }

    private static boolean arraysAreEqual(int[] a, int[] b) {
        if (a == null || b == null) {
            return a == b;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
