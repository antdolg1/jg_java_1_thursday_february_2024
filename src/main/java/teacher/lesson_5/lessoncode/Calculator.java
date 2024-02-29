package teacher.lesson_5.lessoncode;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

//        int biggestNumber = maxOfTwoNumbers(num1, num2);
//        System.out.println("Biggest number is: " + biggestNumber);

        //Test case when num1 is bigger
        testFindBiggestNumber(num1, num2, 20);

    }

    public static int maxOfTwoNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int maxOfTwoNumberWithMath(int num1, int num2) {
        return Math.max(num1, num2);
    }

    /**
     * Находит большее из трёх чисел, без использования вспомогательных библиотек.
     *
     * @param num1 Первое число.
     * @param num2 Второе число.
     * @param num3 Третье число.
     * @return Большее из трёх чисел.
     */
    public static int maxOfThreeNumbers(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static int maxOfThreeNumbersWithMath(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }


    //Tests
    public static void testFindBiggestNumber(int num1, int num2, int expectedResult) {
        int realResult = maxOfTwoNumbers(num1, num2);
        System.out.println("Test with numbers: " + num1 + "," + num2);
        System.out.println("Expected biggest number: " + expectedResult + ", Actual result: " + realResult);

        if (realResult == expectedResult) {
            System.out.println("Test passed ✔️");
        } else {
            System.out.println("Test failed ❌");
        }
    }
}
