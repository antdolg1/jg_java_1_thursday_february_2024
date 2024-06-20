package students.arturs_novikovs.lesson_15.level_2;

public class FraudDetector {
    public boolean isFraud(Trader trader) {
        if (trader == null) {
            throw new IllegalArgumentException("Trader cannot be null!");
        }
        return isFraudulentTraderName(trader) || isFraudulentCity(trader);
    }

    private boolean isFraudulentTraderName(Trader trader) {
        String traderName = trader.getFullName();
        return traderName != null && traderName.equals("Pokemon");
    }

    private boolean isFraudulentCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName != null && cityName.equals("Sidney");
    }
}
