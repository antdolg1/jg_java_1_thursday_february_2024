package students.nikola_korovacka.lesson_15;

class FraudDetector {

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

class Trader {
    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}

