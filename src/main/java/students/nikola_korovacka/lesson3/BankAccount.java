package students.nikola_korovacka.lesson3;

public class BankAccount {
    String owner;
    int amount;

    BankAccount(String owner, int amount){
        this.owner = owner;
        this.amount = amount;
    }
    String getOwner(){
        return this.owner;
    }
    int getAmount(){
        return this.amount;
    }

    void removeAmount(int amountToRemove){
        this.amount = this.amount + amountToRemove;
    }
}
