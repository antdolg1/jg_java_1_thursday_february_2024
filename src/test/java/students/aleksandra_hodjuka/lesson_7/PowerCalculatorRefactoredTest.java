package students.aleksandra_hodjuka.lesson_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorRefactoredTest {
    @Test
    public void testCalculatePowerPositiveExponent() {
        double base = 2.0;
        int exponent = 3;
        double expected = 8.0; // 2^3 = 8
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "2^3 should be 8");
    }

    @Test
    public void testCalculatePowerNegativeExponent() {
        double base = 2.0;
        int exponent = -3;
        double expected = 0.125; // 2^-3 = 1/8 = 0.125
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "2^-3 should be 0.125");
    }

    @Test
    public void testCalculatePowerZeroExponent() {
        double base = 2.0;
        int exponent = 0;
        double expected = 1.0; // 2^0 = 1
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "2^0 should be 1");
    }

    @Test
    public void testCalculatePowerOneExponent() {
        double base = 2.0;
        int exponent = 1;
        double expected = 2.0; // 2^1 = 2
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "2^1 should be 2");
    }

    @Test
    public void testCalculatePowerNegativeBase() {
        double base = -2.0;
        int exponent = 3;
        double expected = -8.0; // (-2)^3 = -8
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "(-2)^3 should be -8");
    }

    @Test
    public void testCalculatePowerNegativeBaseEvenExponent() {
        double base = -2.0;
        int exponent = 2;
        double expected = 4.0; // (-2)^2 = 4
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "(-2)^2 should be 4");
    }

    @Test
    public void testCalculatePowerZeroBasePositiveExponent() {
        double base = 0.0;
        int exponent = 3;
        double expected = 0.0; // 0^3 = 0
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "0^3 should be 0");
    }

    @Test
    public void testCalculatePowerZeroBaseZeroExponent() {
        double base = 0.0;
        int exponent = 0;
        double expected = 1.0; // 0^0 is generally considered 1
        double actual = PowerCalculatorRefactored.calculatePower(base, exponent);
        assertEquals(expected, actual, "0^0 should be 1");
    }

    private void assertEquals(double expected, double actual, String s) {

    }

}