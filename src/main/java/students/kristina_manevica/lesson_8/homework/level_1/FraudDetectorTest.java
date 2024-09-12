package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();

        test.testFraudName();
        test.testFraudAmount();
        test.testFraudCity();
        test.testFraudRule5();
    }

    public static void testFraudName() {
        Trader traderFraudTrue = new Trader("Pokemon", "Riga");
        Trader traderFraudFalse = new Trader("Pokemo", "Tallinn");

        Transaction transaction1 = new Transaction(traderFraudTrue, 1000000);
        Transaction transaction2 = new Transaction(traderFraudFalse, 1000001);

        boolean expectedResultTrue = true;
        boolean expectedResultFalse = false;

        boolean actualResult1 = FraudDetector.isFraudName(transaction1);
        System.out.println((actualResult1 == expectedResultTrue) ? "Name test passed" : "Name test failed!");

        boolean actualResult2 = FraudDetector.isFraudName(transaction2);
        System.out.println((actualResult2 == expectedResultFalse) ? "Name test passed" : "Name test failed!");
    }

    public static void testFraudAmount() {
        Trader traderFraudTrue = new Trader("Pokemon", "Riga");
        Trader traderFraudFalse = new Trader("Pokemo", "Tallinn");
        Trader traderFraudFalse2 = new Trader("Pokem", "Rome");

        Transaction transaction1 = new Transaction(traderFraudTrue, 1000000);
        Transaction transaction2 = new Transaction(traderFraudFalse, 1000001);
        Transaction transaction3 = new Transaction(traderFraudFalse2, 999999);

        boolean expectedResultTrue = true;
        boolean expectedResultFalse = false;

        boolean actualResult1 = FraudDetector.isFraudAmount(transaction1);
        System.out.println((actualResult1 == expectedResultFalse) ? "Amount test passed" : "Amount test failed!");

        boolean actualResult2 = FraudDetector.isFraudAmount(transaction2);
        System.out.println((actualResult2 == expectedResultTrue) ? "Amount test passed" : "Amount test failed!");

        boolean actualResult3 = FraudDetector.isFraudAmount(transaction3);
        System.out.println((actualResult3 == expectedResultFalse) ? "Amount test passed" : "Amount test failed!");
    }

    public static void testFraudCity() {
        Trader traderFraudTrue1 = new Trader("Pokemo", "Sidney");
        Trader traderFraudTrue2 = new Trader("Pokemo", "Jamaica");
        Trader traderFraudFalse = new Trader("Pokemo", "Riga");

        Transaction transaction1 = new Transaction(traderFraudTrue1, 1000000);
        Transaction transaction2 = new Transaction(traderFraudTrue2, 1000000);
        Transaction transaction3 = new Transaction(traderFraudFalse, 1000001);

        boolean expectedResultTrue = true;
        boolean expectedResultFalse = false;

        boolean actualResult1 = FraudDetector.isFraudCity(transaction1);
        System.out.println((actualResult1 == expectedResultTrue) ? "City test passed" : "City test failed!");

        boolean actualResult2 = FraudDetector.isFraudCity(transaction2);
        System.out.println((actualResult2 == expectedResultTrue) ? "City test passed" : "City test failed!");

        boolean actualResult3 = FraudDetector.isFraudCity(transaction3);
        System.out.println((actualResult3 == expectedResultFalse) ? "City test passed" : "City test failed!");
    }

    public static void testFraudRule5() {
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

        boolean actualResult1 = FraudDetector.isFraudRule5(transaction1);
        System.out.println((actualResult1 == expectedResultTrue) ? "Rule5 test passed" : "Rule5 test failed!");

        boolean actualResult2 = FraudDetector.isFraudRule5(transaction2);
        System.out.println((actualResult2 == expectedResultFalse) ? "Rule5 test passed" : "Rule5 test failed!");

        boolean actualResult3 = FraudDetector.isFraudRule5(transaction3);
        System.out.println((actualResult3 == expectedResultFalse) ? "Rule5 test passed" : "Rule5 test failed!");

        boolean actualResult4 = FraudDetector.isFraudRule5(transaction4);
        System.out.println((actualResult4 == expectedResultFalse) ? "Rule5 test passed" : "Rule5 test failed!");
    }
}