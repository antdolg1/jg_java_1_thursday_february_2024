package students.arturs_novikovs.lesson_15.level_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;


class QuadraticEqTest {
    private static QuadraticEq quadraticEq;

    @BeforeAll
    public static void setUp() {
        quadraticEq = new QuadraticEq();
    }

    @Test
    public void testCalc_WhenDiscriminant_MoreThanZero() {
        String result = quadraticEq.calc(1.00, 2.00, -5.00);
        Assertions.assertEquals("x1 = -3,45, x2 = 1,45", result);
    }

    @Test
    public void testCalc_WhenDiscriminant_LessThanZero() {
        String result = quadraticEq.calc(1.00, 1.00, 0.00);
        Assertions.assertEquals("x1 = -1,00, x2 = 0,00", result);
    }

    @Test
    public void testCalc_WhenDiscriminant_Zero() {
        String result = quadraticEq.calc(-2.00, 1.00, 1.00);
        Assertions.assertEquals("x1 = 1,00, x2 = -0,50", result);
    }
}