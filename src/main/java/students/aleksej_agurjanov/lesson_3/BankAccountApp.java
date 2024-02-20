package students.aleksej_agurjanov.lesson_3;

import students.aleksej_agurjanov.lesson_3.BankAccount;

public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasja Pupkin", 100);
        BankAccount bankAccount2 = new BankAccount("Petja V", 555);
        BankAccount bankAccount3 = new BankAccount("Inga G", 666);
        BankAccount bankAccount4 = new BankAccount("Tatjana", 777);

        System.out.println("Owner = " + bankAccount1.getOwner());
        System.out.println("Owner = " + bankAccount2.getOwner());
        System.out.println("Owner = " + bankAccount3.getOwner());
        System.out.println("Owner = " + bankAccount4.getOwner());



    }
}
