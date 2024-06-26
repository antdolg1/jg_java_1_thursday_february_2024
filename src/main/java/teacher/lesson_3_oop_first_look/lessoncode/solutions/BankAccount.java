package teacher.lesson_3_oop_first_look.lessoncode.solutions;

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

    void removeAmount(int amountToRemove) {
        this.amount = this.amount - amountToRemove;
    }

}
