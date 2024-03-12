package students.karina_cmile.lesson_6.level_1_intern;

public class Task_6_1 {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void testIsEven (int number, boolean expectedResult){
        boolean realResult = isEven(number);
        System.out.println("Test with number: " + number);
        System.out.println("Expected number even or not " + expectedResult + ", Actual result: " + realResult);
        if (realResult == expectedResult) {
            System.out.println("Test passed ✔️");
        } else {
            System.out.println("Test failed ❌");
        }
    }
}
