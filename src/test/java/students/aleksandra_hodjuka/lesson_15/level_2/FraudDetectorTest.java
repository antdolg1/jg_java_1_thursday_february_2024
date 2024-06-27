package students.aleksandra_hodjuka.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void testIsFraudulentName_True() {
        // Arrange
        Trader trader = new TraderImpl("Pokemon", "Tokyo");
        FraudDetector detector = new FraudDetector();

        // Act
        boolean result = detector.isFraud(trader);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsFraudulentName_False() {
        // Arrange
        Trader trader = new TraderImpl("Ash Ketchum", "Pallet Town");
        FraudDetector detector = new FraudDetector();

        // Act
        boolean result = detector.isFraud(trader);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsFraudulentCity_True() {
        // Arrange
        Trader trader = new TraderImpl("Misty", "Sidney");
        FraudDetector detector = new FraudDetector();

        // Act
        boolean result = detector.isFraud(trader);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsFraudulentCity_False() {
        // Arrange
        Trader trader = new TraderImpl("Brock", "Pewter City");
        FraudDetector detector = new FraudDetector();

        // Act
        boolean result = detector.isFraud(trader);

        // Assert
        assertFalse(result);
    }
}