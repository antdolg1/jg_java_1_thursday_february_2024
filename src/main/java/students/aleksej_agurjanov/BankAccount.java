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
}
