package students.aleksandra_hodjuka.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {
    @Test
    public void testDiscriminantGreaterThanZero() {
        QuadraticEq eq = new QuadraticEq();
        String result = eq.calc(1, -3, 2);
        assertEquals("x1 = 1.0, x2 = 2.0", result);
    }

    @Test
    public void testDiscriminantEqualsZero() {
        QuadraticEq eq = new QuadraticEq();
        String result = eq.calc(1, -2, 1);
        assertEquals("x = 1.0", result);
    }

    @Test
    public void testDiscriminantLessThanZero() {
        QuadraticEq eq = new QuadraticEq();
        String result = eq.calc(1, 0, 1);
        assertEquals("Equation has no roots", result);
    }

}