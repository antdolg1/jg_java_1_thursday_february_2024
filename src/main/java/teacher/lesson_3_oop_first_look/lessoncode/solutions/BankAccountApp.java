package teacher.lesson_3_oop_first_look.lessoncode.solutions;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Vasja Pupkin", 100);
        BankAccount bankAccount2 = new BankAccount("Petja V", 5);
        BankAccount bankAccount3 = new BankAccount("Inga G", 23);
        BankAccount bankAccount4 = new BankAccount("Tatjana", 3456);

        String owner1 = bankAccount1.getOwner();
        System.out.println(owner1);

        String owner4 = bankAccount4.getOwner();
        System.out.println(owner4);


        System.out.println(bankAccount2.getAmount());
        System.out.println(bankAccount3.getAmount());


        System.out.println(bankAccount4.getOwner());
        System.out.println(bankAccount4.getAmount());
        bankAccount4.addAmount(1000);
        bankAccount4.addAmount(1000);
        System.out.println(bankAccount4.getAmount());

    }


}
