package students.kristina_manevica.lesson_4.homework.level_4;

class CalculatorTest {
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

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();

        int actualResult = calculator.sum(firstNumber, secondNumber);
        System.out.println((actualResult == expectedResult) ? "Sum test = OK" : "Sum test = FAIL");
    }

    public void minusTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();

        int actualResult = calculator.minus(firstNumber, secondNumber);
        System.out.println((actualResult == expectedResult) ? "Minus test = OK" : "Minus test = FAIL");
    }

    public void multipleTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();

        int actualResult = calculator.multiple(firstNumber, secondNumber);
        System.out.println((actualResult == expectedResult) ? "Multiple test = OK" : "Multiple test = FAIL");
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;

        Calculator calculator = new Calculator();

        int actualResult = calculator.division(firstNumber, secondNumber);
        System.out.println((actualResult == expectedResult) ? "Division test = OK" : "Division test = FAIL");
    }

    public void evenTest() {
        int number = 9;
        boolean isExpectedResult = true;

        Calculator calculator = new Calculator();

        boolean isActualResult = calculator.isEven(number);
        System.out.println((isActualResult == isExpectedResult) ? "Even test = Even number" : "Even test = Odd number");
    }

    public void maxTwoNumbersTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int expectedResultOne = numberOne;
        int expectedResultTwo = numberTwo;

        Calculator calculator = new Calculator();

        int actualResultOne = calculator.maxOfTwoNumbers(numberOne, numberTwo);
        System.out.println((actualResultOne == expectedResultOne) ? "First max number" : "Max number test failed!");

        int actualResultTwo = calculator.maxOfTwoNumbers(numberTwo, numberOne);
        System.out.println((actualResultTwo == expectedResultOne) ? "Second max number" : "Max number test failed!");

        int actualResultThree = calculator.maxOfTwoNumbers(numberTwo, numberTwo);
        System.out.println((actualResultThree == expectedResultTwo) ? "Numbers equals" : "Max number test failed!");
    }

    public void maxThreeNumbersTest() {
        int numberOne = 4;
        int numberTwo = 3;
        int numberThree = 2;
        int expectedResult = numberOne;

        Calculator calculator = new Calculator();

        int actualResultOne = calculator.maxOfThreeNumbers(numberOne, numberOne, numberOne);
        System.out.println((actualResultOne == expectedResult) ? "Rule a=b=c" : "Max number test failed!");

        int actualResultTwo = calculator.maxOfThreeNumbers(numberOne, numberTwo, numberThree);
        System.out.println((actualResultTwo == expectedResult) ? "Rule a>b && a>c" : "Max number test failed!");

        int actualResultThree = calculator.maxOfThreeNumbers(numberTwo, numberOne, numberThree);
        System.out.println((actualResultThree == expectedResult) ? "Rule b>a && b>c" : "Max number test failed!");

        int actualResultFour = calculator.maxOfThreeNumbers(numberTwo, numberThree, numberOne);
        System.out.println((actualResultFour == expectedResult) ? "Rule c>a && c>b" : "Max number test failed!");

        int actualResultFive = calculator.maxOfThreeNumbers(numberOne, numberOne, numberTwo);
        System.out.println((actualResultFive == expectedResult) ? "Rule a=b>c" : "Max number test failed!");

        int actualResultSix = calculator.maxOfThreeNumbers(numberOne, numberTwo, numberOne);
        System.out.println((actualResultSix == expectedResult) ? "Rule a=c>b" : "Max number test failed!");

        int actualResultSeven = calculator.maxOfThreeNumbers(numberTwo, numberOne, numberOne);
        System.out.println((actualResultSeven == expectedResult) ? "Rule b=c>a" : "Max number test failed!");
    }
}
