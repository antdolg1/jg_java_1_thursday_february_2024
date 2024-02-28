package students.aleksej_agurjanov.lesson_3;

class BankAccount {

    private String ownerName;
    private int moneyAmount;


    public BankAccount(String ownerName, int moneyAmount) {
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    String getOwner() {
        return this.ownerName;
    }

    int getAmount() {
        return this.moneyAmount;
    }




}
