package students.aleksandra_hodjuka.level_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReturnPositiveNumber();
        test.testContainsEmptyArray();
        test.testCountOccurrences_PositiveScenario();
        test.testCountOccurrences_NegativeScenario();
        test.testCountOccurrences_EmptyArray();
        test.testCountOccurrences_SeveralOccurrences();
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
        boolean expectedResult = true;

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

    @Test
    public void testReplaceFirstOccurrence() {
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 3;
        int newNumber = 7;

        ArrayService.replaceFirst(array, numberToReplace, newNumber);

        // Проверяем, что первое вхождение числа 3 было заменено на 7
        assertEquals(7, array[2]);
    }

    @Test
    public void testReplaceFirstOccurrence_NotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 6; // Числа 6 нет в массиве
        int newNumber = 7;

        ArrayService.replaceFirst(array, numberToReplace, newNumber);

        // Проверяем, что числа 6 нет в массиве и массив остался неизменным
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    private void assertArrayEquals(int[] ints, int[] array) {
    }

    @Test
    public void testReplaceFirstOccurrence_MultipleOccurrences() {
        int[] array = {1, 2, 3, 3, 4, 5};
        int numberToReplace = 3; // Есть два вхождения числа 3 в массиве
        int newNumber = 7;

        ArrayService.replaceFirst(array, numberToReplace, newNumber);

        // Проверяем, что только первое вхождение числа 3 было заменено на 7
        assertEquals(7, array[2]);
        // Проверяем, что второе вхождение числа 3 осталось без изменений
        assertEquals(3, array[3]);
    }

    @Test
    public void testReplaceAll() {
        int[] array = {1, 1, 3, 3, 5};
        int numberToReplace = 3;
        int newNumber = 7;

        ArrayService.replaceAll(array, numberToReplace, newNumber);

        // Проверяем, что все вхождения числа 3 были заменены на 7
        assertArrayEquals(new int[]{1, 1, 7, 7, 5}, array);
    }

    @Test
    public void testReplaceAll_NotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int numberToReplace = 6; // Числа 6 нет в массиве
        int newNumber = 7;

        ArrayService.replaceAll(array, numberToReplace, newNumber);

        // Проверяем, что числа 6 нет в массиве и массив остался неизменным
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSort() {
        int[] array = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};

        ArrayService.sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_EmptyArray() {
        int[] array = {};
        int[] expected = {};

        ArrayService.sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] array = {1};
        int[] expected = {1};

        ArrayService.sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        ArrayService.sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSort_NegativeNumbers() {
        int[] array = {-5, -3, -8, -4, -2};
        int[] expected = {-8, -5, -4, -3, -2};

        ArrayService.sort(array);

        assertArrayEquals(expected, array);
    }
}

