package students.nikita_bortnikovs.lesson_9.homework.level4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    private double cubeSide;
    @Test
    public void testCalculateArea() {
        Square square = new Square(5.0);
        assertEquals(25.00, square.calculateArea(), 0.01);
    }

    @Test
    public void testCalculatePerimeter() {
        Square square = new Square(5.0);
        assertEquals(20.00, square.calculatePerimeter(), 0.01);
    }
}
