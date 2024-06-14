package students.kristina_manevica.lesson_15.homework.level_2;

public class FraudDetector {

    public boolean isFraud(Trader trader) {
        return isFraudulentTraderName(trader) || isFraudulentCity(trader);
    }

    private boolean isFraudulentTraderName(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private boolean isFraudulentCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}