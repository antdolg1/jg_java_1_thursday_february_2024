package students.kristina_manevica.lesson_4.homework.level_4;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minusTest();
        calculatorTest.multipleTest();
        calculatorTest.divisionTest();
        calculatorTest.evenTest();
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
}
