package students.nikita_bortnikovs.lesson_8.homework.task1_24;

public class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super("1");
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;

    }
}
