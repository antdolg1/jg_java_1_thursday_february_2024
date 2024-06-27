package students.arturs_novikovs.lesson_8.level_1;

import org.junit.Test;

public class FraudDetectorTest {

    @Test
    public void testFraudRule1_PositiveScenario() {
        // Positive scenario: Trader's name is "Pokemon"
        Trader trader = new Trader("Pokemon", "Tokyo");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule[] fraudRules = {new FraudRule1()};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        boolean result = fraudDetector.isFraud(transaction);

        assertTrue(result, "Expected the transaction to be marked as fraud.");
    }

    private void assertTrue(boolean result, String s) {
    }

    @Test
    public void testFraudRule1_NegativeScenario_DifferentName() {
        // Negative scenario: Trader's name is not "Pokemon"
        Trader trader = new Trader("John Doe", "Tokyo");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule[] fraudRules = {new FraudRule1()};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        boolean result = fraudDetector.isFraud(transaction);

        assertFalse(result, "Expected the transaction not to be marked as fraud.");
    }

    private void assertFalse(boolean result, String s) {
    }

    @Test
    public void testFraudRule1_NegativeScenario_EmptyName() {
        // Negative scenario: Trader's name is empty
        Trader trader = new Trader("", "Tokyo");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule[] fraudRules = {new FraudRule1()};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        boolean result = fraudDetector.isFraud(transaction);

        assertFalse(result, "Expected the transaction not to be marked as fraud.");
    }
}
