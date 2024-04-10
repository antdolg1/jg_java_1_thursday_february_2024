package students.karina_cmile.lesson_8.level_2_intern_3_junior;

import students.karina_cmile.lesson_8.level_1_intern.FraudDetector;
import students.karina_cmile.lesson_8.level_1_intern.Trader;
import students.karina_cmile.lesson_8.level_1_intern.Transaction;

public class FraudDetectorTest {
    public static void main(String[] args) {

        // 1 Positive scenario - name Alice, amount <1000000, city Ventspils
        Trader trader = new Trader("Alice", "Ventspils");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result1 = fraudDetector1.isFraud1(transaction);
        if (result1) {
            System.out.println("Transaction 1 is not allowed, Pokemon is a fraud.");
        } else {
            System.out.println("Transaction 1 is allowed.");
        }
        boolean result2 = fraudDetector1.isFraud2(transaction);
        if (result2) {
            System.out.println("Transaction 1 is not allowed, transaction limit exceeded.");
        } else {
            System.out.println("Transaction 1 is allowed.");
        }
        boolean result3 = fraudDetector1.isFraud3(transaction);
        if (result3) {
            System.out.println("Transaction 1 is not allowed, Sydney city is not allowed.");
        } else {
            System.out.println("Transaction 1 is allowed.");
        }

            // 2 Negative scenario - name Pokemon, amount <1000000, Ventspils
            Trader trader1 = new Trader("Pokemon", "Ventspils");
            Transaction transaction1 = new Transaction(trader1, 10);
            FraudDetector fraudDetector2 = new FraudDetector();
            boolean result4 = fraudDetector2.isFraud1(transaction1);
            if (result4) {
                System.out.println("Transaction 2 is not allowed, Pokemon is a fraud.");
            } else {
                System.out.println("Transaction 2 is allowed.");
            }
            boolean result5 = fraudDetector2.isFraud2(transaction1);
            if (result5) {
                System.out.println("Transaction 2 is not allowed, transaction limit exceeded.");
            } else {
                System.out.println("Transaction 2 is allowed.");
            }
            boolean result6 = fraudDetector2.isFraud3(transaction1);
            if (result6) {
                System.out.println("Transaction 2 is not allowed, Sydney city is not allowed.");
            } else {
                System.out.println("Transaction 2 is allowed.");
            }


        // 3 Negative scenario - name Robert, amount >1000000, Ventspils
        Trader trader2 = new Trader("Robert", "Ventspils");
        Transaction transaction2 = new Transaction(trader2, 100000000);
        FraudDetector fraudDetector3 = new FraudDetector();
        boolean result7 = fraudDetector3.isFraud1(transaction2);
        if (result7) {
            System.out.println("Transaction 3 is not allowed, Pokemon is a fraud.");
        } else {
            System.out.println("Transaction 3 is allowed.");
        }
        boolean result8 = fraudDetector3.isFraud2(transaction2);
        if (result8) {
            System.out.println("Transaction 3 is not allowed, transaction limit exceeded.");
        } else {
            System.out.println("Transaction 3 is allowed.");
        }
        boolean result9 = fraudDetector3.isFraud3(transaction2);
        if (result9) {
            System.out.println("Transaction 3 is not allowed, Sydney city is not allowed.");
        } else {
            System.out.println("Transaction 3 is allowed.");
        }

        // 4 Negative scenario - name John, amount <1000000, Sydney
        Trader trader3 = new Trader("John", "Sydney");
        Transaction transaction3 = new Transaction(trader3, 10);
        FraudDetector fraudDetector4 = new FraudDetector();
        boolean result10 = fraudDetector4.isFraud1(transaction3);
        if (result10) {
            System.out.println("Transaction 4 is not allowed, Pokemon is a fraud.");
        } else {
            System.out.println("Transaction 4 is allowed.");
        }
        boolean result11 = fraudDetector3.isFraud2(transaction3);
        if (result11) {
            System.out.println("Transaction 4 is not allowed, transaction limit exceeded.");
        } else {
            System.out.println("Transaction 4 is allowed.");
        }
        boolean result12 = fraudDetector4.isFraud3(transaction3);
        if (result12) {
            System.out.println("Transaction 4 is not allowed, Sydney city is not allowed.");
        } else {
            System.out.println("Transaction 4 is allowed.");
        }
    }
}
