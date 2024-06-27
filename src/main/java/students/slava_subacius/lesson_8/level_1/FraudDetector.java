package students.slava_subacius.lesson_8.level_1;

public class FraudDetector {


    public boolean isFraud(Transaction transaction) {
        if(isPokemonTrader(transaction.getTrader())) {
            return true;
        }
        if (transaction.getAmount() > 1000000) {
            return true;
        }

        return false;
    }

    private boolean isPokemonTrader(Trader trader) {
        return trader.getName().equalsIgnoreCase("Pokemon");
    }

}
