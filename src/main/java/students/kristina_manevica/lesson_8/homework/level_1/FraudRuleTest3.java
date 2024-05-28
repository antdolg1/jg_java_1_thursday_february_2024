package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRuleTest3 {
    public static void main(String[] args) {

        FraudRuleTest3 test3 = new FraudRuleTest3();

        test3.testFraudRule3();
    }

    public static void testFraudRule3() {
        Trader traderFraudTrue1 = new Trader("Pokemo", "Sidney");
        Trader traderFraudTrue2 = new Trader("Pokemo", "Jamaica");
        Trader traderFraudFalse = new Trader("Pokemo", "Riga");

        Transaction transaction1 = new Transaction(traderFraudTrue1, 1000000);
        Transaction transaction2 = new Transaction(traderFraudTrue2, 1000000);
        Transaction transaction3 = new Transaction(traderFraudFalse, 1000001);

        boolean expectedResultTrue = true;
        boolean expectedResultFalse = false;

        FraudRule3 rule3 = new FraudRule3("Rule3");

        boolean actualResult1 = rule3.isFraud(transaction1);
        System.out.println((actualResult1 == expectedResultTrue) ? "Rule3 test passed" : "Rule3 test failed!");

        boolean actualResult2 = rule3.isFraud(transaction2);
        System.out.println((actualResult2 == expectedResultTrue) ? "Rule3 test passed" : "Rule3 test failed!");

        boolean actualResult3 = rule3.isFraud(transaction3);
        System.out.println((actualResult3 == expectedResultFalse) ? "Rule3 test passed" : "Rule3 test failed!");
    }
}