package students.nikola_korovacka.lesson_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {

    @Test
    public void testIsFraudulentTraderName() {
        FraudDetector detector = new FraudDetector();
        Trader fraudulentTrader = new Trader("Pokemon", "SomeCity");
        Trader legitimateTrader = new Trader("Ash", "SomeCity");

        assertTrue(detector.isFraud(fraudulentTrader));
        assertFalse(detector.isFraud(legitimateTrader));
    }

    @Test
    public void testIsFraudulentCity() {
        FraudDetector detector = new FraudDetector();
        Trader fraudulentCityTrader = new Trader("Ash", "Sidney");
        Trader legitimateCityTrader = new Trader("Ash", "Pallet Town");

        assertTrue(detector.isFraud(fraudulentCityTrader));
        assertFalse(detector.isFraud(legitimateCityTrader));
    }

    @Test
    public void testIsFraudulentTraderNameAndCity() {
        FraudDetector detector = new FraudDetector();
        Trader fullyFraudulentTrader = new Trader("Pokemon", "Sidney");

        assertTrue(detector.isFraud(fullyFraudulentTrader));
    }
}
