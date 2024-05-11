package students.karina_cmile.lesson_8.level_1_intern;

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
