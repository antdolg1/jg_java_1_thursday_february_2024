package students.nikola_korovacka.lesson_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEqTest {

    @Test
    public void testDiscriminantGreaterThanZero() {
        QuadraticEq equation = new QuadraticEq();
        String result = equation.calc(1, -3, 2);
        assertEquals("x1 = 1.0, x2 = 2.0", result);
    }

    @Test
    public void testDiscriminantEqualsZero() {
        QuadraticEq equation = new QuadraticEq();
        String result = equation.calc(1, -2, 1);
        assertEquals("x = 1.0", result);
    }

    @Test
    public void testDiscriminantLessThanZero() {
        QuadraticEq equation = new QuadraticEq();
        String result = equation.calc(1, 2, 5);
        assertEquals("Equation has no roots", result);
    }
}


