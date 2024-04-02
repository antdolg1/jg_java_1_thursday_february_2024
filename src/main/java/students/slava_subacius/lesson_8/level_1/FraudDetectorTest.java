package students.slava_subacius.lesson_8.level_1;

public class FraudDetectorTest {
    public static void main(String[] args) {
        testFraudulentTransaction();
        testNonFraudulentTransaction();
        testLargeAmountTransaction();
    }

    public static void testFraudulentTransaction() {
        Trader pokemonTrader = new Trader("Pokemon", "City");
        Transaction fraudulentTransaction = new Transaction(pokemonTrader, 1000);

        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(fraudulentTransaction)) {
            System.out.println("Test for fraudulent transaction passed.");
        } else {
            System.out.println("Test for fraudulent transaction failed.");
        }
    }

    public static void testNonFraudulentTransaction() {
        Trader otherTrader = new Trader("John", "City");
        Transaction nonFraudulentTransaction = new Transaction(otherTrader, 1000);

        FraudDetector fraudDetector = new FraudDetector();

        if (!fraudDetector.isFraud(nonFraudulentTransaction)) {
            System.out.println("Test for non-fraudulent transaction passed.");
        } else {
            System.out.println("Test for non-fraudulent transaction failed.");
        }
    }

    public static void testLargeAmountTransaction() {
        Trader trader = new Trader("John", "City");
        Transaction largeAmountTransaction = new Transaction(trader, 2000000);

        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isFraud(largeAmountTransaction)) {
            System.out.println("Test for large amount transaction passed.");
        } else {
            System.out.println("Test for large amount transaction failed.");
        }
    }
}


