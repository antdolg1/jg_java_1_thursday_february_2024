package students.ruslan_k.lesson_7.level_6;

public class CreditCardTest {
    public static void main(String[] args) {
        boolean result;
        CreditCard card = new CreditCard(123456789, "0000");
        result = setCreditLimitTest(-1000, card);
        System.out.println("Set negative Credit Limit Test :" + (result ? "Passed" : "Failed"));
        result = setCreditLimitTest(1000, card);
        System.out.println("Set positive Credit Limit Test :" + (result ? "Passed" : "Failed"));
        result = makeDepositWOCreditDuty(1000, "0000", card);
        System.out.println("Put Deposit W/O credit duty Test :" + (result ? "Passed" : "Failed"));
        result = withdrawWOMakeCreditDuty(1000, "0000", card);
        System.out.println("Make withdraw W/O credit duty Test :" + (result ? "Passed" : "Failed"));
        result = withdrawWithMakeCreditDuty(1000, "0000", card);
        System.out.println("Make withdraw With credit duty Test :" + (result ? "Passed" : "Failed"));
        result = overdraw(1000, "0000", card);
        System.out.println("Make overdraw Test :" + (result ? "Passed" : "Failed"));
        result = returnSomeMoney(500, "0000", card);
        System.out.println("Return some money (Deposit<Credit Duty) Test :" + (result ? "Passed" : "Failed"));
        result = returnSomeMoney2(1000, "0000", card);
        System.out.println("Return some money (Deposit>Credit Duty) Test :" + (result ? "Passed" : "Failed"));
        result = withdrawIncorrectPIN(1000, "1000", card);
        System.out.println("Incorrect PIN (withdraw) Test :" + (result ? "Passed" : "Failed"));
        result = depositIncorrectPIN(1000, "1000", card);
        System.out.println("Incorrect PIN (deposit) Test :" + (result ? "Passed" : "Failed"));
        System.out.println("-------------");

    }

    static boolean setCreditLimitTest(double limit, CreditCard card) {

        card.setCreditLimit(limit);
        if (limit >= 0) {
            return card.getCreditLimit() == limit;
        } else {
            return card.getCreditLimit() == 0;
        }
    }

    static boolean makeDepositWOCreditDuty(double deposit, String pin, CreditCard card) {
        card.makeDeposit(pin, deposit);
        return card.getBalance() == deposit;
    }

    static boolean withdrawWOMakeCreditDuty(double withdraw, String pin, CreditCard card) {
        card.withdraw(pin, withdraw);
        return card.getBalance() == 0;
    }

    static boolean withdrawWithMakeCreditDuty(double withdraw, String pin, CreditCard card) {
        card.withdraw(pin, withdraw);
        return card.getCreditDuty() == 1000;
    }
    static boolean overdraw(double withdraw, String pin, CreditCard card) {
        card.withdraw(pin, withdraw);
        return card.getCreditDuty() == 1000;
    }
    static boolean returnSomeMoney(double deposit, String pin, CreditCard card) {
        card.makeDeposit(pin, deposit);
        return card.getCreditDuty() == 500 && card.getBalance()==0;
    }
    static boolean returnSomeMoney2(double deposit, String pin, CreditCard card) {
        card.makeDeposit(pin, deposit);
        return card.getCreditDuty() == 0 && card.getBalance()==500;
    }

    static boolean withdrawIncorrectPIN(double withdraw, String pin, CreditCard card){
        card.withdraw(pin, withdraw);
        return card.getCreditDuty() == 0 && card.getBalance()==500;
    }
    static boolean depositIncorrectPIN(double deposit, String pin, CreditCard card){
        card.makeDeposit(pin, deposit);
        return card.getCreditDuty() == 0 && card.getBalance()==500;
    }


}
