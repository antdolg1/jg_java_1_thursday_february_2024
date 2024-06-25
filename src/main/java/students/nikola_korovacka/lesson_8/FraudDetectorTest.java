package students.nikola_korovacka.lesson_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FraudDetectorTest {

    @Test
    public void testIsFraud_FraudulentTrader() {
        //мошенник трейдер с именем Pokemon
        Task_intern2.Trader fraudTrader = new Task_intern2.Trader("Pokemon", "Milan");

        // Создаем транзакцию с мошенническим
        Task_intern2.Transaction transaction = new Task_intern2.Transaction(fraudTrader, 1000);

        // Создаем объект FraudDetector
        Task_intern2.FraudDetector fraudDetector = new Task_intern2.FraudDetector();

        // Проверяем, что транзакция с мошенником-трейдером считается мошенничеством
        Assertions.assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void testIsFraud_NormalTrader() {
        // Создаем нормального трейдера
        Task_intern2.Trader normalTrader = new Task_intern2.Trader("Nikolka", "Ogre");
        // Создаем новую транзакцию с нормальным трейдером
        Task_intern2.Transaction transaction = new Task_intern2.Transaction(normalTrader, 1000);
        Task_intern2.FraudDetector fraudDetector = new Task_intern2.FraudDetector();
        // Проверяем, что транзакция с нормальным трейдером не считается мошенничеством
        Assertions.assertFalse(fraudDetector.isFraud(transaction));
    }
}
