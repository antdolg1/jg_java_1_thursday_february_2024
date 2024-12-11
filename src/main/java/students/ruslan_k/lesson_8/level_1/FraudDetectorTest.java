package students.ruslan_k.lesson_8.level_1;

public class FraudDetectorTest {
    public static void main(String[] args) {
        String result;
        FraudRule1 rule1 = new FraudRule1("Rule 1");
        FraudRule2 rule2 = new FraudRule2("Rule 2");
        FraudRule3 rule3 = new FraudRule3("Rule 3");
        FraudRule4 rule4 = new FraudRule4("Rule 4");
        FraudRule5 rule5 = new FraudRule5("Rule 5");
        FraudRule[] rules = {rule1, rule2, rule3, rule4, rule5};

        Trader trader1 = new Trader("SpiderMan", "New York", "USA");
        Trader trader2 = new Trader("Pokemon", "New Ark", "USA");
        Trader trader3 = new Trader("Flint", "Sydney", "Austral");
        Trader trader4 = new Trader("J.F.K.", "Washington", "USA");
        Trader trader5 = new Trader("FC Jamaica", "Kingston", "Jamaica");
        Trader trader6 = new Trader("Helmut Kol", "Bonn", "Germany");

        Transaction trans1 = new Transaction(trader1, 1000001);
        Transaction trans2 = new Transaction(trader2, 5000);
        Transaction trans3 = new Transaction(trader3, 125000);
        Transaction trans4 = new Transaction(trader4, 1);
        Transaction trans5 = new Transaction(trader5, 1000);
        Transaction trans6 = new Transaction(trader6, 1001);

        FraudDetector fraudDetector = new FraudDetector(rules);
        result = fraudDetector.isFraud(trans1);
        System.out.println("Trans 1 is " + (result.isEmpty() ? "Not Fraud" : "Fraud " + result));
        result = fraudDetector.isFraud(trans2);
        System.out.println("Trans 2 is " + (result.isEmpty() ? "Not Fraud" : "Fraud " + result));
        result = fraudDetector.isFraud(trans3);
        System.out.println("Trans 3 is " + (result.isEmpty() ? "Not Fraud" : "Fraud " + result));
        result = fraudDetector.isFraud(trans4);
        System.out.println("Trans 4 is " + (result.isEmpty() ? "Not Fraud" : "Fraud " + result));
        result = fraudDetector.isFraud(trans5);
        System.out.println("Trans 5 is " + (result.isEmpty() ? "Not Fraud" : "Fraud " + result));
        result = fraudDetector.isFraud(trans6);
        System.out.println("Trans 6 is " + (result.isEmpty() ? "Not Fraud" : "Fraud " + result));

    }

}
