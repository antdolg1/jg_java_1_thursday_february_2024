package students.aleksandra_hodjuka.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReturnPositiveNumber();
        test.testContainsEmptyArray();

    }

    public void shouldReturnPositiveNumber() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int numberToSearch = 1;
        boolean result = ArrayService.contains(array, numberToSearch);
        assertTrue(result);

        if (result) {
            System.out.println(numberToSearch + " = OK!");
        } else {
            System.out.println(numberToSearch + " = FAIL!");
        }
        assertTrue(ArrayService.contains(array, numberToSearch));
    }

    private void assertTrue(boolean contains) {

    }

    public void testContainsEmptyArray() {

        ArrayService arrayService = new ArrayService();
        int[] array = {};
        int numberToSearch = 0;
        boolean result = ArrayService.contains(array, numberToSearch);
        assertTrue(result);

        if (result) {
            System.out.println(numberToSearch + " = OK!");
        } else {
            System.out.println(numberToSearch + " = FAIL!");
        }
        assertTrue(ArrayService.contains(array, numberToSearch));
    }


}

