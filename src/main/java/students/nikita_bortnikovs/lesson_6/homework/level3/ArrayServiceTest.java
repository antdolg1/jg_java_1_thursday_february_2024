package students.nikita_bortnikovs.lesson_6.homework.level3;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldFindNumber1();
        test.shouldFindNumber2();
        test.shouldFindNumber3();
        test.shouldFindNumber4();
        test.shouldFindNumber5();
        test.shouldFindNumber6();
        test.shouldFindNumber7();
        test.shouldFindNumber8();
        test.shouldFindNumber9();
        test.shouldFindNumber10();
        test.shouldNotFindNumber11();
        test.shouldNotFindNumber12();
    }

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void shouldFindNumber1() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 1);
        checkTestResult(result, true);
    }

    public void shouldFindNumber2() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 2);
        checkTestResult(result, true);
    }

    public void shouldFindNumber3() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 3);
        checkTestResult(result, true);
    }

    public void shouldFindNumber4() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 4);
        checkTestResult(result, true);
    }

    public void shouldFindNumber5() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 5);
        checkTestResult(result, true);
    }

    public void shouldFindNumber6() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 6);
        checkTestResult(result, true);
    }

    public void shouldFindNumber7() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 7);
        checkTestResult(result, true);
    }

    public void shouldFindNumber8() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 8);
        checkTestResult(result, true);
    }

    public void shouldFindNumber9() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 9);
        checkTestResult(result, true);
    }

    public void shouldFindNumber10() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 10);
        checkTestResult(result, true);
    }

    public void shouldNotFindNumber11() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 11);
        checkTestResult(result, false);
    }

    public void shouldNotFindNumber12() {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        boolean result = arrayServiceMethods.findArrayNumber(array, 12);
        checkTestResult(result, false);
    }

    public void checkTestResult(boolean actualResult, boolean expectedResult) {
        if (actualResult == expectedResult) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
