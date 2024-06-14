package students.kristina_manevica.lesson_15.homework.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FraudDetectorTest {

    private static FraudDetector fraudDetector;

    @BeforeAll
    public static void setUp() {
        fraudDetector = new FraudDetector();
    }

    @Test
    public void testFraudTrader_ByName() {
        Trader trader = new Trader("Riga", "Pokemon");
        Assertions.assertTrue(fraudDetector.isFraud(trader), "Should be detected as fraud due to name!");
    }

    @Test
    public void testFraudTrader_ByCity() {
        Trader trader = new Trader("Sidney", "Baltazar");
        Assertions.assertTrue(fraudDetector.isFraud(trader), "Should be detected as fraud due to city!");
    }

    @Test
    public void testFraudTrader_ByName_And_City() {
        Trader trader = new Trader("Sidney", "Pokemon");
        Assertions.assertTrue(fraudDetector.isFraud(trader), "Should be detected as fraud due to name and city!");
    }

    @Test
    public void testTrader_With_NoFraudIndications() {
        Trader trader = new Trader("Marupe", "Ezhik");
        Assertions.assertFalse(fraudDetector.isFraud(trader), "Should not be detected as fraud, no indications!");
    }

    @Test
    public void test_NullTrader_ThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fraudDetector.isFraud(null),
                "Method isFraud should throw IllegalArgumentException when Trader is null!");
    }
}