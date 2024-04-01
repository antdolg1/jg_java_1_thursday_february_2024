package students.ruslan_k.lesson_4.level_7;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


class CalculatorTest {
    Calculator calculator = new Calculator();

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        System.out.printf("Sum test = %s\n", calculator.sum(firstNumber, secondNumber) == 75 ? "OK" : "Fail");

    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        System.out.printf("Sub test = %s\n", calculator.sub(firstNumber, secondNumber) == 20 ? "OK" : "Fail");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        System.out.printf("Mul test = %s\n", calculator.mul(firstNumber, secondNumber) == 25 ? "OK" : "Fail");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        System.out.printf("Div test = %s\n", calculator.div(firstNumber, secondNumber) == 5 ? "OK" : "Fail");
    }

    public void isEvenTest1() {
        System.out.printf("isEven test = %s\n", calculator.isEven(40) ? "OK" : "Fail");
    }

    public void isEvenTest2() {
        System.out.printf("isEven test = %s\n", calculator.isEven(41) ? "Fail" : "Ok");
    }

}
