package students.aleksandra_hodjuka.lesson_8;

 class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
            return true;
        }
        return false;
    }
     boolean isBigSumFraud(Transaction transaction) {
         int amount = transaction.getAmount();
         if (amount==1000000) {
             return true;
         }
         return false;
     }
     boolean isFraudCity(Transaction transaction) {
         Trader trader = transaction.getTrader();
         String city = trader.getCity();
         if (city.equals("Sidney")) {
             return true;
         }
         return false;
     }
}
