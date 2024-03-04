package students.ruslan_k.lesson_4.level_6;

public class StockApp {
    public static void main(String[] args) {
        Stock maxCamp = new Stock("Max Kellemann's Camp", 5);
        System.out.println(maxCamp.getPriceInformation());
        maxCamp.updatePrice(10);
        maxCamp.updatePrice(20);
        maxCamp.updatePrice(30);
        maxCamp.updatePrice(15);
        maxCamp.updatePrice(1);
        maxCamp.updatePrice(100);
        maxCamp.updatePrice(85);

        System.out.println(maxCamp.getPriceInformation());
    }
}
