package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRuleTest2 {

    public static void main(String[] args) {

        FraudRuleTest2 test2 = new FraudRuleTest2();

        test2.testFraudRule2();
    }

    public static void testFraudRule2() {
        Trader traderFraudTrue = new Trader("Pokemon", "Riga");
        Trader traderFraudFalse = new Trader("Pokemo", "Tallinn");
        Trader traderFraudFalse2 = new Trader("Pokem", "Rome");

        Transaction transaction1 = new Transaction(traderFraudTrue, 1000000);
        Transaction transaction2 = new Transaction(traderFraudFalse, 1000001);
        Transaction transaction3 = new Transaction(traderFraudFalse2, 999999);

        boolean expectedResultTrue = true;
        boolean expectedResultFalse = false;

        FraudRule2 rule2 = new FraudRule2("Rule2");

        boolean actualResult1 = rule2.isFraud(transaction1);
        System.out.println((actualResult1 == expectedResultFalse) ? "Rule2 test passed" : "Rule2 test failed!");

        boolean actualResult2 = rule2.isFraud(transaction2);
        System.out.println((actualResult2 == expectedResultTrue) ? "Rule2 test passed" : "Rule2 test failed!");

        boolean actualResult3 = rule2.isFraud(transaction3);
        System.out.println((actualResult3 == expectedResultFalse) ? "Rule2 test passed" : "Rule2 test failed!");
    }
}