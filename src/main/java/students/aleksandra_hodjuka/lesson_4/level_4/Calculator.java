package students.aleksandra_hodjuka.lesson_4.level_4;

class Calculator {


    int firstNumber;
    int secondNumber;
    int thirdNumber;


    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub1(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div1(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int realResult) {
        return realResult % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }

    public int equalNumbers(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    public int threeEqualNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}


