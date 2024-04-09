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
}