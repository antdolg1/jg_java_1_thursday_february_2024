package students.ruslan_k.lesson_6.level_1;

class NumberUtils {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

class IsEvenTest {
    public static void main(String[] args) {
        int testValue1 = 12;
        int testValue2 = 15;
        System.out.printf("Test EVEN : %s\n", NumberUtils.isEven(testValue1) ? "Passed" : "Failed");
        System.out.printf("Test ODD : %s\n", !NumberUtils.isEven(testValue2) ? "Passed" : "Failed");
    }
}