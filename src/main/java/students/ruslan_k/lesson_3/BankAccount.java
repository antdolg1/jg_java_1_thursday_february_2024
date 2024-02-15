package students.ruslan_k.lesson_3;

public class BankAccount {
    String owner;
    int amount;

    BankAccount(String newOwner, int newAmount) {
        this.owner=newOwner;
        this.amount=newAmount;
    }

    String getOwner(){
        return this.owner;
    }
    int getAmount(){
        return this.amount;
    }

}


