package teacher.lesson_14.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testFactorialOfZero() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        Calculator calculator = new Calculator();
        calculator.factorial(-12);
    }

}
