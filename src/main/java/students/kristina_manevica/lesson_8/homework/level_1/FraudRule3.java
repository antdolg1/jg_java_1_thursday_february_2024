package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    //rule3 and rule4 are combined into one rule
    public boolean isFraud(Transaction t) {
        String[] fraudCities = {"Sidney", "Jamaica"};

        for (String city : fraudCities) {
            if (t.getTrader().getCity().equals(city)) {
                return true;
            }
        }
        return false;
    }
}