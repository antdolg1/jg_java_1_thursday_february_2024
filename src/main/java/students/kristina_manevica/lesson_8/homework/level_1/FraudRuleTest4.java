package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRuleTest4 {
    public static void main(String[] args) {

        FraudRuleTest4 test4 = new FraudRuleTest4();

        test4.testFraudRule4();
    }

    public static void testFraudRule4() {
        Trader traderFraudTrue = new Trader("Pokemo", "Germany");
        Trader traderFraudFalse1 = new Trader("Pokemo", "Germany");
        Trader traderFraudFalse2 = new Trader("Pokemo", "Rome");
        Trader traderFraudFalse3 = new Trader("Pokemo", "Germany");

        Transaction transaction1 = new Transaction(traderFraudTrue, 1001);
        Transaction transaction2 = new Transaction(traderFraudFalse1, 1000);
        Transaction transaction3 = new Transaction(traderFraudFalse2, 1001);
        Transaction transaction4 = new Transaction(traderFraudFalse3, 999);

        boolean expectedResultTrue = true;
        boolean expectedResultFalse = false;

        FraudRule4 rule4 = new FraudRule4("Rule4");

        boolean actualResult1 = rule4.isFraud(transaction1);
        System.out.println((actualResult1 == expectedResultTrue) ? "Rule4 test passed" : "Rule4 test failed!");

        boolean actualResult2 = rule4.isFraud(transaction2);
        System.out.println((actualResult2 == expectedResultFalse) ? "Rule4 test passed" : "Rule4 test failed!");

        boolean actualResult3 = rule4.isFraud(transaction3);
        System.out.println((actualResult3 == expectedResultFalse) ? "Rule4 test passed" : "Rule4 test failed!");

        boolean actualResult4 = rule4.isFraud(transaction4);
        System.out.println((actualResult4 == expectedResultFalse) ? "Rule4 test passed" : "Rule4 test failed!");
    }
}