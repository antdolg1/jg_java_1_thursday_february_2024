package students.nikola_korovacka.lesson_8;

public class Task_intern1 {
    class Trader {

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



    public class Transaction {

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

    class FraudDetector {
        boolean isFraud(Transaction t) {
            // Реализация проверки на мошенничество
            return true;
        }
    }

}
