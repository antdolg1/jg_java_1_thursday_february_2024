package students.ruslan_k.lesson_3;

public class BankAccount {
    private String owner;
    private int amount;

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
    void addAmount(int sum){
        this.amount+=sum;
    }

    void subsAmount(int sum){
        this.amount-=sum;
    }
    void setOwner(String name){
        this.owner=name;
    }
    void setAmount(int sum){
        this.amount=sum;
    }
}


