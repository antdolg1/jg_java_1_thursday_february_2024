package students.nikola_korovacka.lesson_8;

public class Task_intern2 {

    static class Trader {

        private String name;
        private String city;

        public Trader(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getName() {
            return this.name;
        }

        public String getCity() {
            return this.city;
        }

    }

    public static class Transaction {

        private Trader trader;
        private int amount;

        public Transaction(Trader trader, int amount) {
            this.trader = trader;
            this.amount = amount;
        }

        public Trader getTrader() {
            return this.trader;
        }

        public int getAmount() {
            return this.amount;
        }

    }

    static class FraudDetector {

        boolean isFraud(Transaction t) {
            Trader trader = t.getTrader(); // Получаем трейдера из транзакции
            String traderName = trader.getName(); // Получаем имя трейдера

            // Проверяем, является ли имя трейдера "Pokemon"
            return "Pokemon".equals(traderName);
        }

    }

}

