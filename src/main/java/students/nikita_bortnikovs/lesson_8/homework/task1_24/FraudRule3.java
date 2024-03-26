package students.nikita_bortnikovs.lesson_8.homework.task1_24;

public class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super("3");
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Sydney") || t.getTrader().getCity().equals("Jamaica")) {
            return true;
        }
        return false;
    }
}
