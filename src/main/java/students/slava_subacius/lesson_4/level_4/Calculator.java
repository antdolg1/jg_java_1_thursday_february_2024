package students.slava_subacius.lesson_4.level_4;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return ((number % 2) == 0);
    }

    public int maxOfTwoNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}


