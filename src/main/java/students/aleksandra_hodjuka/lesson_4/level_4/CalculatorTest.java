package students.aleksandra_hodjuka.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sub1Test();
        calculatorTest.sumTest();
        calculatorTest.mulTest();
        calculatorTest.div1Test();
        calculatorTest.firstNumberIsBigger();
        calculatorTest.secondNumberIsBigger();
        calculatorTest.numbersAreEqual();
        calculatorTest.firstOfThreeNumberIsBigger();
        calculatorTest.secondOfThreeNumberIsBigger();
        calculatorTest.thirdOfThreeNumberIsBigger();
        calculatorTest.allThreeNumbersAreEqual();

    }

    private void allThreeNumbersAreEqual() {
        int firstNumber = 30;  // подготавливаем тестовые данные
        int secondNumber = 30;
        int thirdNumber = 30;// подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.threeEqualNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == firstNumber) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Все три  числа равны = OK");
        } else {

            System.out.println("Все три равны = FAIL");
        }
    }

    private void thirdOfThreeNumberIsBigger() {
        int firstNumber = 50;  // подготавливаем тестовые данные
        int secondNumber = 70;  // подготавливаем тестовые данные
        int thirdNumber = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == thirdNumber) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Третье число больше = OK");
        } else {

            System.out.println("Третье число больше = FAIL");
        }
    }

    private void secondOfThreeNumberIsBigger() {
        int firstNumber = 20;  // подготавливаем тестовые данные
        int secondNumber = 100;  // подготавливаем тестовые данные
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == secondNumber) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Второе число больше = OK");
        } else {

            System.out.println("Второе число больше = FAIL");
        }
    }

    private void firstOfThreeNumberIsBigger() {
        int firstNumber = 50;  // подготавливаем тестовые данные
        int secondNumber = 30;  // подготавливаем тестовые данные
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == firstNumber) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Первое число больше = OK");
        } else {

            System.out.println("Первое число больше = FAIL");
        }
    }


    private void numbersAreEqual() {
        int firstNumber = 30;  // подготавливаем тестовые данные
        int secondNumber = 30;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.equalNumbers(firstNumber, secondNumber);
        if (realResult == firstNumber) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Оба числа равны = OK");
        } else {

            System.out.println("Оба числа равны = FAIL");
        }
    }

    private void secondNumberIsBigger() {
        int firstNumber = 20;  // подготавливаем тестовые данные
        int secondNumber = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == secondNumber) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Второе число больше = OK");
        } else {

            System.out.println("Второе число больше = FAIL");
        }
    }

    private void firstNumberIsBigger() {
        int firstNumber = 50;  // подготавливаем тестовые данные
        int secondNumber = 30;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == firstNumber) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Первое число больше = OK");
        } else {

            System.out.println("Первое число больше = FAIL");
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
        if (realResult % 2 == 0) {
            System.out.println("Результат 1 test четное число");
        } else {
            System.out.println("Результат Div1 test нечетное число");
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
        if (realResult % 2 == 0) {
            System.out.println("Результат MUL test четное число");
        } else {
            System.out.println("Результат MUL test нечетное число");
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
        if (realResult % 2 == 0) {
            System.out.println("Результат Sum test четное число");
        } else {
            System.out.println("Результат Sum test нечетное число");
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
        if (realResult % 2 == 0) {
            System.out.println("Результат Sub1 test четное число");
        } else {
            System.out.println("Результат Sub1 test нечетное число");
        }
    }
}
