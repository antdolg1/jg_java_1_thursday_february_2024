package students.ruslan_k.lesson_8.level_1;//package students.ruslan_k.lesson_8.level_1;


class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader() {
        return trader;
    }

    int getAmount() {
        return amount;
    }
}