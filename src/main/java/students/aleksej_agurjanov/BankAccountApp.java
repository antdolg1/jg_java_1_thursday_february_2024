package students.aleksej_agurjanov;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Vasja Pupkin", 100);
        BankAccount bankAccount2 = new BankAccount("Petja V", 555);
        BankAccount bankAccount3 = new BankAccount("Inga G", 666);
        BankAccount bankAccount4 = new BankAccount("Tatjana", 777);

        String owner1 = bankAccount1.getOwner();
        System.out.println(owner1);

        String owner4 = bankAccount4.getOwner();
        System.out.println(owner4);

    }
}
