package students.nikita_bortnikovs.lesson_8.homework.task1_24;

public class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super("4");
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Germany") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}
