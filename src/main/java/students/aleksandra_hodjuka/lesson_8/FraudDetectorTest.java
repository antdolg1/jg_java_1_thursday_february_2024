package students.aleksandra_hodjuka.lesson_8;

class FraudDetectorTest {
    public static void main(String[] args) {
        testIsFraudPositive();
        testIsFraudNegative();
        testIsBigSumFraudPositive();
        testIsBigSumFraudNegative();
        testIsFraudCityPositive();
        testIsFraudCityNegative();
    }

    private static void testIsFraudCityNegative() {
        Trader trader = new Trader("Alien", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraudCity(transaction);
        if (!result) {
            System.out.println("Negative Test: Passed. Not Sidney.Transaction is allowed");
        } else {
            System.out.println("Negative Test: Failed. Transaction is  not allowed.");
        }
    }

    private static void testIsFraudCityPositive() {
        Trader trader = new Trader("Alien", "Sidney");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraudCity(transaction);
        if (result) {
            System.out.println("Positive Test: Passed. Fraud is from Sidney. Transaction is not allowed.");
        } else {
            System.out.println("Positive Test: Failed. Transaction is allowed.");
        }
    }

    private static void testIsBigSumFraudNegative() {
        Transaction transaction = new Transaction(new Trader("Alien", "Riga"), 5000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isBigSumFraud(transaction);

        if (!result) {
            System.out.println("Negative Test for isBigSumFraud: Passed. Transaction is allowed.");
        } else {
            System.out.println("Negative Test for isBigSumFraud: Failed. Transaction is not allowed.");
        }
    }

    private static void testIsBigSumFraudPositive() {
        Transaction transaction = new Transaction(new Trader("Alien", "Riga"), 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isBigSumFraud(transaction);

        if (result) {
            System.out.println("Positive Test for isBigSumFraud: Passed. Transaction is not allowed.");
        } else {
            System.out.println("Positive Test for isBigSumFraud: Failed. Transaction is allowed.");
        }
    }

    private static void testIsFraudNegative() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        if (result) {
            System.out.println("Positive Test: Passed. Transaction is not allowed.");
        } else {
            System.out.println("Positive Test: Failed. Transaction is allowed.");
        }
    }

    private static void testIsFraudPositive() {
        Trader trader = new Trader("Alien", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        if (!result) {
            System.out.println("Negative Test: Passed. Transaction is allowed.");
        } else {
            System.out.println("Negative Test: Failed. Transaction is not allowed.");
        }
    }
}

