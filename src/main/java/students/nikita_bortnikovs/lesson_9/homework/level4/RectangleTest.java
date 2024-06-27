package students.nikita_bortnikovs.lesson_9.homework.level4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class RectangleTest {
    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new MyRectangleA("My Rectangle",5.0,10.0);
        assertEquals(50.0, rectangle.calculateArea(), 0.01);
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle rectangle = new MyRectangleA("My Rectangle",5.0,10.0);
        assertEquals(30.0, rectangle.calculatePerimeter(), 0.01);
    }


}
//finished on 19th task