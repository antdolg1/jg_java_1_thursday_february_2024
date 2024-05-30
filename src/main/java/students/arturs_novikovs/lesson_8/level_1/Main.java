package students.arturs_novikovs.lesson_8.level_1;

public class Main {
    public static void main(String[] args) {
        Trader trader1 = new Trader("Pokemon", "Tokyo");
        Transaction transaction1 = new Transaction(trader1, 500);

        FraudRule[] fraudRules = { new FraudRule1() };
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        System.out.println("Transaction 1 is fraud: " + fraudDetector.isFraud(transaction1)); // true
    }
}
