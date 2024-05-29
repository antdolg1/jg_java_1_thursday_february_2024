package students.aleksandra_hodjuka.lesson_7;

import org.junit.Test;

import static org.junit.Assert.*;


public class CreditCardTest {
    @Test
    public void testDepositWithValidPin() {
        CreditCard card = new CreditCard("1234567890123456", "1234");
        card.deposit("1234", 500.0);
        assertEquals(500.0, card.getBalance(), 0.01); // Проверка, что баланс равен 500.0 после зачисления
        assertEquals(0.0, card.getDebt(), 0.01); // Проверка, что задолженность равна 0.0 после зачисления
    }

    @Test
    public void testDepositWithInvalidPin() {
        CreditCard card = new CreditCard("1234567890123456", "1234");
        card.deposit("0000", 500.0); // Используем неверный пин-код
        assertEquals(0.0, card.getBalance(), 0.01); // Проверка, что баланс остается 0.0
        assertEquals(0.0, card.getDebt(), 0.01); // Проверка, что задолженность остается 0.0
    }

    @Test
    public void testWithdrawWithValidPin() {
        CreditCard card = new CreditCard("1234567890123456", "1234");
        card.setCreditLimit(500.0);
        card.deposit("1234", 1000.0); // Внесем сначала 1000, чтобы была возможность снять 100
        card.withdraw("1234", 100.0);
        assertEquals(900.0, card.getBalance(), 0.01); // Ожидаем, что баланс будет 900.0 после снятия
        assertEquals(0.0, card.getDebt(), 0.01); // Проверка, что задолженность равна 0.0 после снятия
    }

    @Test
    public void testWithdrawWithInvalidPin() {
        CreditCard card = new CreditCard("1234567890123456", "1234");
        card.setCreditLimit(500.0);
        card.deposit("1234", 1000.0); // Внесем сначала 1000, чтобы была возможность снять 100
        card.withdraw("0000", 100.0); // Используем неверный пин-код
        assertEquals(1000.0, card.getBalance(), 0.01); // Проверка, что баланс остается 1000.0
        assertEquals(0.0, card.getDebt(), 0.01); // Проверка, что задолженность остается 0.0
    }

//    @Test
//    public void testWithdrawExceedingCreditLimit() {
//        CreditCard card = new CreditCard("1234567890123456", "1234");
//        card.setCreditLimit(500.0);
//        card.deposit("1234", 300.0);
//        card.withdraw("1234", 1000.0); // Снятие превышает кредитный лимит
//        assertEquals(300.0, card.getBalance(), 0.01); // Проверка, что баланс остается 300.0
//        assertEquals(700.0, card.getDebt(), 0.01); // Проверка, что задолженность равна 700.0
//    }
}