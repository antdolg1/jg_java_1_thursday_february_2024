package students.aleksandra_hodjuka.level_3;

class ArrayServiceTest {
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
        boolean result = ArrayService.contains(array, numberToSearch);
        assertTrue(result);

        if (result) {
            System.out.println(numberToSearch + " = Данное число есть в массиве!");
        } else {
            System.out.println(numberToSearch + " = Данного числа нет в массиве!");
        }
        assertTrue(ArrayService.contains(array, numberToSearch));
    }

    private void assertTrue(boolean contains) {

    }

    public void testContainsEmptyArray() {

        ArrayService arrayService = new ArrayService();
        int[] array = { };
        int numberToSearch = 2;
        boolean result = ArrayService.contains(array, numberToSearch);
        assertFalse(result);

        if (result) {
            System.out.println(numberToSearch +" - " + "Тест на поиск числа в пустом массиве " + " = Passed!");
        } else {
            System.out.println(numberToSearch +" - "+ "Тест на поиск числа в пустом массиве "+ " = Failed!");
        }
        assertTrue(ArrayService.contains(array, numberToSearch));
    }

    private void assertFalse(boolean result) {
    }

    public void testCountOccurrences_PositiveScenario() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 3, 5};
        int numberToSearch = 3;
        int expected = 2;
        int actual = ArrayService.countOccurrences(array, numberToSearch);
        assertEquals(expected, actual);
        System.out.println("Результат теста позитивного сценария: " + (expected == actual ? "Passed" : "Failed"));
    }

    private void assertEquals(int expected, int actual) {
    }

    public void testCountOccurrences_NegativeScenario() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 3, 5};
        int numberToSearch = 10;
        int expected = 0;
        int actual = ArrayService.countOccurrences(array, numberToSearch);
        assertEquals(expected, actual);
        System.out.println("Результат теста негативного сценария: " + (expected == actual ? "Passed" : "Failed"));
    }

    public void testCountOccurrences_EmptyArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {};
        int numberToSearch = 1000;
        int expected = 0;
        int actual = ArrayService.countOccurrences(array, numberToSearch);
        assertEquals(expected, actual);
        System.out.println("Результат теста сценария пустого массива: " + (expected == actual ? "Passed" : "Failed"));
    }

    public void testCountOccurrences_SeveralOccurrences() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 1, 3, 3, 5};
        int numberToSearch = 3;
        int expected = 2;
        int actual = ArrayService.countOccurrences(array, numberToSearch);
        assertEquals(expected, actual);
        System.out.println("Результат теста подсчета количества появления числа в массиве: "
                + (expected == actual ? "Passed" : "Failed"));
    }

}

