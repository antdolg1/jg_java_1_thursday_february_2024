package students.nikita_bortnikovs.lesson_8.homework.task1_24;

public class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super("2");
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 10000) {
            return true;
        }
        return false;
    }
}
