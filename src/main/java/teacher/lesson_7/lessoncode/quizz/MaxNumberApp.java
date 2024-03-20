package teacher.lesson_7.lessoncode.quizz;

public class MaxNumberApp {

    public int maxOfTwoNumbers(int numOne, int numTwo) {
        if (numOne > numTwo) {
            return numOne;
        } else {
            return numTwo;
        }
    }

    public int maxOfTwoNumbersV2(int numOne, int numTwo) {
        return numOne > numTwo ? numOne : numTwo;
    }

    public int maxOfTwoNumbersV3(int numOne, int numTwo) {
        return Math.max(numOne, numTwo);
    }

    public int maxOfThreeNumbers(int numOne, int numTwo, int numThree) {
        return Math.max(Math.max(numOne, numTwo), numThree);
    }
}
