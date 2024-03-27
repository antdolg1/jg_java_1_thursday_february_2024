package students.ruslan_k.lesson_7.level_6;

public class CreditCard {
    private final int cardNr;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double creditDuty;

    CreditCard(int cardNr, String pinCode) {
        this.cardNr = cardNr;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditDuty = 0;

    }

    void setCreditLimit(double limit) {
        if (limit >= 0) {
            this.creditLimit = limit;
        } else {
            this.creditLimit = 0;
            System.out.println("Can't set negative credit limit. Credit limit set to 0");
        }
    }

    void makeDeposit(String pin, double deposit) {
        if (this.pinCode.equals(pin)) {
            if (this.creditDuty != 0) {
                depositWithCreditDuty(deposit);
            } else {
                this.balance += deposit;
            }
        } else {
            System.out.println("Transaction rejected with reason \"PIN incorrect\"");
        }

    }

    private void depositWithCreditDuty(double deposit) {
        this.creditDuty -= deposit;
        if (this.creditDuty < 0) {
            this.balance -= this.creditDuty;
            this.creditDuty = 0;
        }
    }

    void withdraw(String pin, double withdraw) {
        if (isWithdrawPossible(withdraw) && this.pinCode.equals(pin)) {
            this.balance -= withdraw;
            if (this.balance < 0) {
                this.creditDuty -= this.balance;
                this.balance = 0;
            }
        } else {
            System.out.println("Transaction rejected"); // Отказ без объяснений
        }
    }

    private boolean isWithdrawPossible(double withdraw) {
        return (this.balance + this.creditLimit - this.creditDuty) >= withdraw;
    }

    double getBalance() {
        return this.balance;
    }

    double getCreditLimit() {
        return this.creditLimit;
    }

    double getCreditDuty() {
        return this.creditDuty;
    }
}
