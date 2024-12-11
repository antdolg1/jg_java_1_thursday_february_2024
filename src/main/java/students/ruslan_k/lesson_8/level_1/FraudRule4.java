package students.ruslan_k.lesson_8.level_1;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public FraudDetectionResult isFraud(Transaction t) {
        return new FraudDetectionResult(t.getTrader().getCountry().equals("Jamaica"), getRuleName());
    }
}
