package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudDetector {

    public static boolean isFraudName(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

    public static boolean isFraudAmount(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

    public static boolean isFraudCity(Transaction t) {
        String[] fraudCities = {"Sidney", "Jamaica"};

        for (String city : fraudCities) {
            if (t.getTrader().getCity().equals(city)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFraudRule5(Transaction t) {
        if (t.getTrader().getCity().equals("Germany") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}