package students.aleksandra_hodjuka.lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {
        testStock();
    }

    public static void testStock() {
        // Создание объекта акции
        Stock google = new Stock("GOOG", 10);

        // Получение информации о цене перед обновлением
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        // Обновление цен акции в соответствии с последовательностью: 10 -> 12 -> 5 -> 7 -> 99 -> 77
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);

        // Тестирование максимальной цены за указанный период
        testCase(google, 999);            // Максимальная цена за указанный период: 999
        testCase(google, 1);              // Максимальная цена за указанный период: 999
        testCase(google, 2, 1000);        // Максимальная цена за указанный период: 1000
        testCase(google, 8, 1000);        // Максимальная цена за указанный период: 1000
        testCase(google, 9, 27);          // Максимальная цена за указанный период: 27

        // Получение информации о цене после обновления
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }

    // Метод для тестирования максимальной цены за указанный период
    public static void testCase(Stock stock, double... prices) {
        for (double price : prices) {
            stock.updatePrice(price);
            System.out.println("Изменение цены акции: " + price + " = Максимальная цена за указанный период: " + stock.getMaxPrice());
        }
    }

}
