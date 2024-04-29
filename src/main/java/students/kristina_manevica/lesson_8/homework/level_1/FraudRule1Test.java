package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRule1Test {

    public static void main(String[] args) {

        FraudRule1Test test1 = new FraudRule1Test();

        test1.testFraudRule1();
    }

    public static void testFraudRule1() {
        Trader traderFraudTrue = new Trader("Pokemon", "Riga");
        Trader traderFraudFalse = new Trader("Pokemo", "Tallinn");

        Transaction transaction1 = new Transaction(traderFraudTrue, 1000000);
        Transaction transaction2 = new Transaction(traderFraudFalse, 1000001);

        FraudRule1 rule1 = new FraudRule1("Rule1");

        boolean expectedResultTrue = true;
        boolean expectedResultFalse = false;

        boolean actualResult1 = rule1.isFraud(transaction1);
        System.out.println((actualResult1 == expectedResultTrue) ? "Rule1 test passed" : "Rule1 test failed!");

        boolean actualResult2 = rule1.isFraud(transaction2);
        System.out.println((actualResult2 == expectedResultFalse) ? "Rule1 test passed" : "Rule1 test failed!");
    }
}