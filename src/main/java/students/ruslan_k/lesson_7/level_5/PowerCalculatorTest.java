package students.ruslan_k.lesson_7.level_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {

        System.out.printf("Test base > 0 and power > 0 is %s\n", calcTest(2.0, 3, 8) ? "Passed" : "Failed");
        System.out.printf("Test base < 0 and power > 0 is %s\n", calcTest(-2.0, 3, -8) ? "Passed" : "Failed");
        System.out.printf("Test base > 0 and power < 0 is %s\n", calcTest(2.0, -3, 0.125) ? "Passed" : "Failed");
        System.out.printf("Test base < 0 and power < 0 is %s\n", calcTest(-2.0, -3, -0.125) ? "Passed" : "Failed");
        System.out.printf("Test base > 0 and power = 0 is %s\n", calcTest(2.0, 0, 1) ? "Passed" : "Failed");
        System.out.printf("Test base = 0 and power > 0 is %s\n", calcTest(0, 5, 0) ? "Passed" : "Failed");
        System.out.println("Test, base = 0 and power < 0, will be Incorrect because divide by 0");
    }

    static boolean calcTest(double base, int pow, double expResult) {
        return expResult == PowerCalculator.powerOf(base, pow);
    }
}
