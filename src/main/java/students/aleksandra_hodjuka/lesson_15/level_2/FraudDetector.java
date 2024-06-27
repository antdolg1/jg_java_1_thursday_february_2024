package students.aleksandra_hodjuka.lesson_15.level_2;

public class FraudDetector  {
    public boolean isFraud(Trader trader) {
        return isFraudulentName(trader) || isFraudulentCity(trader);
    }


    boolean isFraudulentName(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    boolean isFraudulentCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}
