package students.karina_cmile.lesson_8.level_1_intern;

import java.util.Scanner;

public class FraudDetector {

    // Rule 1
    public boolean isFraud1(Transaction t) {
        return t.getTrader().getName().equals("Pokemon");
    }
    // Rule 2
    public boolean isFraud2(Transaction t) {
        return t.getAmount() > 1000000;
    }
    // Rule 3
    public boolean isFraud3(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }

    public static void main(String[] args) {
        Trader trader = new Trader("Pokemon", "Sydney");
        Transaction transaction = new Transaction(trader, 100000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result1 = fraudDetector.isFraud1(transaction);
        if (result1) {
            System.out.println("Transaction is not allowed, Pokemon is a fraud.");
        } else {
            System.out.println("Transaction is allowed.");
        }

        boolean result2 = fraudDetector.isFraud2(transaction);
        if (result2) {
            System.out.println("Transaction is not allowed, transaction limit exceeded.");
        } else {
            System.out.println("Transaction is allowed.");
        }

        boolean result3 = fraudDetector.isFraud3(transaction);
        if (result3) {
            System.out.println("Transaction is not allowed, Sydney city is not allowed.");
        } else {
            System.out.println("Transaction is allowed.");
        }

    }
}



