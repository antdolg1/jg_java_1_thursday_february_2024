package students.kristina_manevica.lesson_4.homework.level_6;

class StockTest {
    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.stockTest();
    }

    public void stockTest() {
        Stock stock = new Stock("A&A", 10000);

        System.out.println(stock.getPriceInformation());

        stock.updatePrice(21500);
        stock.updatePrice(9300);
        stock.updatePrice(35500);

        System.out.println(stock.getPriceInformation());
    }
}
