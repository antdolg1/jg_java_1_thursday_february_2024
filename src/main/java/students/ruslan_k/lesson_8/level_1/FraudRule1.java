package students.ruslan_k.lesson_8.level_1;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public FraudDetectionResult isFraud(Transaction t) {
        return new FraudDetectionResult(t.getTrader().getFullName().equals("Pokemon"), getRuleName());
    }
}
