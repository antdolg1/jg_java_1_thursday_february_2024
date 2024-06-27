package students.ruslan_k.lesson_10.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class KConverterTest {

    private KConverter kConverter;
    private double testTemp = 0.0;

    @Before
    public void initialize() {
        kConverter = new KConverter();
    }

    @Test
    public void celsiusToKelvinConverterTest() {
        double expectTemp = 273.15;
        assertEquals(expectTemp, kConverter.tConvert(testTemp));
    }
}