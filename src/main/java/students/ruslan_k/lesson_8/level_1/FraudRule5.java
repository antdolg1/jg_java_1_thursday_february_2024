package students.ruslan_k.lesson_8.level_1;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public FraudDetectionResult isFraud(Transaction t) {
        return new FraudDetectionResult((t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000), getRuleName());
    }

}
