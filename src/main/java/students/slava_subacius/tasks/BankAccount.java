package students.slava_subacius.tasks;

public class BankAccount {
    private String owner;
    private int amount;

    BankAccount(String owner, int amount) {
        this.owner = owner;
        this.amount = amount;
    }

    String getOwner() {
        return this.owner;
    }

    int getAmount() {
        return this.amount;
    }

    void addAmount(int amountToAdd) {
        this.amount = this.amount + amountToAdd;
    }

    void removeAmount(int amountToRemove) {
        this.amount = this.amount - amountToRemove;
    }
}
