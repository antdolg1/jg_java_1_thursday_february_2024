package students.kristina_manevica.lesson_4.homework.level_4;

class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.minusTest();
        calculatorTest.multipleTest();
        calculatorTest.divisionTest();
        calculatorTest.evenTest();
        calculatorTest.maxTwoNumbersTest();
        calculatorTest.maxThreeNumbersTest();
    }

    private void checkIntResult(int actualResult, int expectedResult) {
        System.out.println((actualResult == expectedResult) ? "Test passed" : "Error");
    }

    private void checkBooleanResult(boolean actualResult, boolean expectedResult) {
        System.out.println((actualResult == expectedResult) ? "Test passed" : "Error");
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        checkIntResult((calculator.sum(firstNumber, secondNumber)), expectedResult);
    }

    public void minusTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        checkIntResult((calculator.minus(firstNumber, secondNumber)), expectedResult);
    }

    public void multipleTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        checkIntResult((calculator.multiple(firstNumber, secondNumber)), expectedResult);
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;

        checkIntResult((calculator.division(firstNumber, secondNumber)), expectedResult);
    }

    public void evenTest() {
        int number = 9;
        boolean isExpectedResult = true;

        checkBooleanResult((calculator.isEven(number)), isExpectedResult);
    }

    public void maxTwoNumbersTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int expectedResultOne = numberOne;
        int expectedResultTwo = numberTwo;

        checkIntResult((calculator.maxOfTwoNumbers(numberOne, numberTwo)), expectedResultOne);

        checkIntResult((calculator.maxOfTwoNumbers(numberTwo, numberOne)), expectedResultOne);

        checkIntResult((calculator.maxOfTwoNumbers(numberTwo, numberTwo)), expectedResultTwo);
    }

    public void maxThreeNumbersTest() {
        int numberOne = 4;
        int numberTwo = 3;
        int numberThree = 2;
        int expectedResult = numberOne;

        //"Rule a=b=c"
        checkIntResult((calculator.maxOfThreeNumbers(numberOne, numberOne, numberOne)), expectedResult);
        //"Rule a>b && a>c"
        checkIntResult((calculator.maxOfThreeNumbers(numberOne, numberTwo, numberThree)), expectedResult);
        //"Rule b>a && b>c"
        checkIntResult((calculator.maxOfThreeNumbers(numberTwo, numberOne, numberThree)), expectedResult);
        //"Rule c>a && c>b"
        checkIntResult((calculator.maxOfThreeNumbers(numberTwo, numberThree, numberOne)), expectedResult);
        //"Rule a=b>c"
        checkIntResult((calculator.maxOfThreeNumbers(numberOne, numberOne, numberTwo)), expectedResult);
        //"Rule a=c>b"
        checkIntResult((calculator.maxOfThreeNumbers(numberOne, numberTwo, numberOne)), expectedResult);
        //"Rule b=c>a"
        checkIntResult((calculator.maxOfThreeNumbers(numberTwo, numberOne, numberOne)), expectedResult);
    }
}
