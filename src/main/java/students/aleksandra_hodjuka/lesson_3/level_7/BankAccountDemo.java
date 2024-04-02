package students.aleksandra_hodjuka.lesson_3.level_7;

class BankAccountDemo {


    private String owner;
    private int money;

    public BankAccountDemo(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

    public static void main(String[] args) {
        BankAccountDemo bankAccountDemo = new BankAccountDemo("Viktor", 100000);
        String owner = bankAccountDemo.getOwner();
        int money = bankAccountDemo.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
