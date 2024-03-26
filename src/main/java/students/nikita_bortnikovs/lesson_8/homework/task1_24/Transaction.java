package students.nikita_bortnikovs.lesson_8.homework.task1_24;

public class Transaction {
    public Trader getTrader() {
        return trader;
    }
    public int getAmount() {
        return amount;
    }

    private Trader trader;

    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }
}