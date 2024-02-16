package students.aleksej_agurjanov;

public class BankAccount {
    String owner;

    int amount;


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
    void addAmout(int amountToAdd) {
        this.removeAmount = this.amount - amountToAdd;
    }

}
