package students.slava_subacius.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();
    }


    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        int number = 10;
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("isEven test = OK ");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 20;
        int expectedResult = 20;
        int realResult = calculator.maxOfTwoNumbers(num1, num2);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }
    public void maxOfThreeNumbersTest() {
        Calculator calculator = new Calculator();


        int result1 = calculator.maxOfThreeNumbers(10, 5, 3);
        if (result1 == 10) {
            System.out.println("Scenario 1: First number is the largest - OK");
        } else {
            System.out.println("Scenario 1: First number is the largest - FAIL");
        }


        int result2 = calculator.maxOfThreeNumbers(5, 10, 3);
        if (result2 == 10) {
            System.out.println("Scenario 2: Second number is the largest - OK");
        } else {
            System.out.println("Scenario 2: Second number is the largest - FAIL");
        }


        int result3 = calculator.maxOfThreeNumbers(5, 3, 10);
        if (result3 == 10) {
            System.out.println("Scenario 3: Third number is the largest - OK");
        } else {
            System.out.println("Scenario 3: Third number is the largest - FAIL");
        }


        int result4 = calculator.maxOfThreeNumbers(10, 10, 5);
        if (result4 == 10) {
            System.out.println("Scenario 4: First two numbers are equal and greater than the third - OK");
        } else {
            System.out.println("Scenario 4: First two numbers are equal and greater than the third - FAIL");
        }


        int result5 = calculator.maxOfThreeNumbers(5, 5, 5);
        if (result5 == 5) {
            System.out.println("Scenario 5: All three numbers are equal - OK");
        } else {
            System.out.println("Scenario 5: All three numbers are equal - FAIL");
        }


    }
}



