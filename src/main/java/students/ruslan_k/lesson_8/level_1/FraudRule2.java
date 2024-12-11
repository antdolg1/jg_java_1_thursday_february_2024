package students.ruslan_k.lesson_8.level_1;

class FraudRule2 extends FraudRule {
    private int maxAmount = 1000000;

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public FraudDetectionResult isFraud(Transaction t) {
        return new FraudDetectionResult(t.getAmount() > maxAmount, getRuleName());
    }

}
