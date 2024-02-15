package students.karina_cmile.lesson_3.lessoncode;

public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Vasja Pupkin", 100);
        BankAccount bankAccount2 = new BankAccount("Petja V", 5);
        BankAccount bankAccount3 = new BankAccount("Inga G", 23);
        BankAccount bankAccount4 = new BankAccount("Tatjana", 3456);
        BankAccount bankAccount5 = new BankAccount("Rodion", 12345);

        String owner1 = bankAccount1.getOwner();
        System.out.println(bankAccount1.getOwner());

        String owner4 = bankAccount4.getOwner();
        System.out.println(bankAccount4.getOwner());

        System.out.println(bankAccount2.getAmount());
        System.out.println(bankAccount3.getAmount());

        System.out.println(bankAccount5.getOwner());
        System.out.println(bankAccount5.getAmount());
        bankAccount5.addAmount(1000);
        bankAccount5.addAmount(1000);
        System.out.println(bankAccount5.getAmount());

        System.out.println(bankAccount5.getOwner());
        System.out.println(bankAccount5.getAmount());
        bankAccount5.redAmount(200);
        bankAccount5.redAmount(1000);
        System.out.println(bankAccount5.getAmount());


    }
}
