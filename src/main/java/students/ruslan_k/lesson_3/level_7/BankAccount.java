package students.ruslan_k.lesson_3.level_7;

class BankAccount {

    private String owner;
    private int moneyAmount;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount=moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}

