package students.aleksandra_hodjuka.lesson_7;

public class CreditCard {
    private String cardNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.debt = 0;
    }

    public void deposit(String pinCode, double amount) {
        if (!isValidPin(pinCode)) {
            System.out.println("Неверный пин-код. Операция отклонена.");
            return;
        }

        if (amount < 0) {
            System.out.println("Сумма для зачисления должна быть положительной.");
            return;
        }

        if (debt > 0) {
            double paidFromDebt = Math.min(debt, amount);
            debt -= paidFromDebt;
            amount -= paidFromDebt;
        }

        balance += amount;
        System.out.println("Зачисление успешно. Новый баланс: " + balance);
    }

    public void withdraw(String pinCode, double amount) {
        if (!isValidPin(pinCode)) {
            System.out.println("Неверный пин-код. Операция отклонена.");
            return;
        }

        if (amount < 0) {
            System.out.println("Сумма для снятия должна быть положительной.");
            return;
        }

        double availableFunds = balance + debt;
        if (availableFunds < amount) {
            double excess = amount - availableFunds;
            if (excess > creditLimit) {
                System.out.println("Превышен кредитный лимит. Операция отклонена.");
                return;
            }
            // Снятие средств с учетом кредитного лимита
            double withdrawalAmount = amount - Math.min(amount, creditLimit);
            balance -= withdrawalAmount;
            debt += excess; // Add the excess amount to the debt
            System.out.println("Снятие успешно. Новая задолженность: " + debt);
            return;
        }

        balance -= amount;
        System.out.println("Снятие успешно. Новый баланс: " + balance);
    }

    private boolean isValidPin(String pinCode) {
        return this.pinCode.equals(pinCode);
    }

    private boolean hasEnoughFunds(double amount) {
        return balance + debt >= amount;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getDebt() {
        return debt;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
