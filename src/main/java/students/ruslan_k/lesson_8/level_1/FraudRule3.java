package students.ruslan_k.lesson_8.level_1;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public FraudDetectionResult isFraud(Transaction t) {
        return new FraudDetectionResult(t.getTrader().getCity().equals("Sydney"), getRuleName());

    }

}
