package students.aleksandra_hodjuka.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTestDividedToTwo();
        calculatorTest.sumTest();
        calculatorTest.sub1TestDividedToTwo();
        calculatorTest.sub1Test();
        calculatorTest.sub2TestDividedToTwo();
        calculatorTest.sub2Test();
        calculatorTest.mulTestDividedToTwo();
        calculatorTest.mulTest();
        calculatorTest.div1TestDividedToTwo();
        calculatorTest.div1Test();
        calculatorTest.div2TestDividedToTwo();
        calculatorTest.div2Test();
    }


    private void div2TestDividedToTwo() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 30;  // подготавливаем тестовые данные
            int expectedResult = 1;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.div2(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                if (realResult % 2 == 0) {
                    System.out.println("Div2 test = Четное число");
                } else {
                    System.out.println("Div2 test = Нечетное число");
                }
            }
        }
    }

    private void div1TestDividedToTwo() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = 2;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.div1(secondNumber, firstNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                if (realResult % 2 == 0) {
                    System.out.println("Div1 test = Четное число");
                } else {
                    System.out.println("Div1 test = Нечетное число");
                }
            }
        }
    }

    private void mulTestDividedToTwo() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 30;  // подготавливаем тестовые данные
            int expectedResult = 900;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.mul(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                if (realResult % 2 == 0) {
                    System.out.println("Mul test = Четное число");
                } else {
                    System.out.println("Mul test = Нечетное число");
                }
            }
        }

    }

    private void sub2TestDividedToTwo() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = 30;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.sub2(secondNumber, firstNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                if (realResult % 2 == 0) {
                    System.out.println("Sub2 test = Четное число");
                } else {
                    System.out.println("Sub2 test = Нечетное число");
                }
            }
        }
    }

    private void sub1TestDividedToTwo() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = -30;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.sub1(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                if (realResult % 2 == 0) {
                    System.out.println("Sub1 test = Четное число");
                } else {
                    System.out.println("Sub1 test = Нечетное число");
                }
            }
        }
    }

    private void sumTestDividedToTwo() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = 90;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                if (realResult % 2 == 0) {
                    System.out.println("Sum test = Четное число");
                } else {
                    System.out.println("Sum test = Нечетное число");
                }
            }
        }

    }

    private void div2Test() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 30;  // подготавливаем тестовые данные
            int expectedResult = 1;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.div2(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("Div2 test = OK");
            } else {
                System.out.println("Div2 test = FAIL");
                if (realResult % 2 == 0) {
                    System.out.println("Div2 test = Четное число");
                } else {
                    System.out.println("Div2 test = Нечетное число");
                }
            }
        }

    }

    private void div1Test() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = 2;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.div1(secondNumber, firstNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("Div1 test = OK");
            } else {
                System.out.println("Div1 test = FAIL");
            }
        }


    }

    private void mulTest() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 30;  // подготавливаем тестовые данные
            int expectedResult = 900;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.mul(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("Mul test = OK");
            } else {
                System.out.println("Mul test = FAIL");
            }
        }

    }

    private void sub2Test() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = 30;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.sub2(secondNumber, firstNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("sub2 test = OK");
            } else {
                System.out.println("sub2 test = FAIL");
            }
        }

    }

    private void sub1Test() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = -30;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.sub2(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("sub1 test = OK");
            } else {
                System.out.println("sub1 test = FAIL");
            }
        }

    }

    private void sumTest() {
        {
            int firstNumber = 30;  // подготавливаем тестовые данные
            int secondNumber = 60;  // подготавливаем тестовые данные
            int expectedResult = 90;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("sum test = OK");
            } else {
                System.out.println("sum test = FAIL");
            }
        }
    }
}
