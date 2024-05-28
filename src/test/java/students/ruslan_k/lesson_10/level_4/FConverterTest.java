package students.ruslan_k.lesson_10.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FConverterTest {

    private FConverter fConverter;
    private double testTemp = 0.0;

    @Before
    public void initialize() {
        fConverter = new FConverter();
    }

    @Test
    public void celsiusToFahrenheitConverterTest() {
        double expectTemp = 32.0;
        assertEquals(expectTemp, fConverter.tConvert(testTemp));
    }
}