package students.karina_cmile.lesson_3.lessoncode;

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

    void addAmount(int amountToadd) {
        this.amount = this.amount + amountToadd;
    }

    void redAmount(int amountTored) {
        this.amount = this.amount - amountTored;
    }
}