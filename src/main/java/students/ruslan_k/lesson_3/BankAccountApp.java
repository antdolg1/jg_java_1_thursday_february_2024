package students.ruslan_k.lesson_3;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Vovochka", 1000);
        BankAccount acc2 = new BankAccount("Olen'ka", 5000);
        BankAccount acc3 = new BankAccount("MarIvanna", 10000);

        System.out.println(acc1.getAmount() +"  " + acc1.owner);
        System.out.println(acc2.amount +"  " + acc2.owner);
        System.out.println(acc3.amount +"  " + acc3.owner);

    }
}
