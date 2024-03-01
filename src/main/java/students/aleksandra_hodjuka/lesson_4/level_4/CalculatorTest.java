package students.aleksandra_hodjuka.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sub1Test();
        calculatorTest.sumTest();
        calculatorTest.sub2Test();
        calculatorTest.mulTest();
        calculatorTest.div1Test();
        calculatorTest.div2Test();


    }

    private void div2Test() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 20;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.div2(secondNumber, firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Div1 test = OK");
        } else {

            System.out.println("Div1 test = FAIL");
        }

    }

    private void div1Test() {

        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.div1(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Div1 test = OK");
        } else {

            System.out.println("Div1 test = FAIL");
        }

    }

    private void mulTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Mul test = OK");
        } else {

            System.out.println("Mul test = FAIL");
        }
    }

    private void sub2Test() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = -5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub2(secondNumber, firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub2 test = OK");
        } else {

            System.out.println("Sub2 test = FAIL");
        }
    }

    private void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {

            System.out.println("Sum test = FAIL");
        }

    }

    public void sub1Test() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub1(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub1 test = OK");
        } else {

            System.out.println("Sub1 test = FAIL");
        }


    }
}
