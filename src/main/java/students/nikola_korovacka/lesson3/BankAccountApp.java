package students.nikola_korovacka.lesson3;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasja Pup", 200);
        BankAccount bankAccount2 = new BankAccount("Petja", 56);
        BankAccount bankAccount3 = new BankAccount("Vlad", 37);
        BankAccount bankAccount4 = new BankAccount("Tatjana", 99);
        BankAccount bankAccount5 = new BankAccount("Vika", 72);
        BankAccount bankAccount6 = new BankAccount("Sveta", 3345);

        String owner1 = bankAccount1.getOwner();
        System.out.println(owner1);

        String owner4 = bankAccount4.getOwner();
        System.out.println(owner4);

        System.out.println(bankAccount2.getAmount());
        System.out.println(bankAccount3.getAmount());

        System.out.println(bankAccount4.getOwner());
        System.out.println(bankAccount4.getAmount());
        bankAccount4.removeAmount( 10);
        bankAccount4.removeAmount( 12);
        System.out.println(bankAccount4.getAmount());

    }

}
