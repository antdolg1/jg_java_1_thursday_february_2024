package students.kristina_manevica.lesson_4.homework.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiple(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return (number % 2 == 0) ? true : false;
    }
}
