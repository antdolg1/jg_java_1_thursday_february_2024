package students.nikita_bortnikovs.lesson_9.homework.level4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    public double radius;

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle(5.0);
        assertEquals(78.53981633974483, circle.calculateArea(), 0.01);
    }

    @Test
    public void testCalculatePerimeter() {
        Circle circle = new Circle(5.0);
        assertEquals(31.41592653589793, circle.calculatePerimeter(), 0.01);
    }

}
