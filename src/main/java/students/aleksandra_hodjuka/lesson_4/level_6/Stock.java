package students.aleksandra_hodjuka.lesson_4.level_6;

public class Stock {
    private String companyName;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String companyName, double initialPrice) {
        this.companyName = companyName;
        this.currentPrice = initialPrice;
        this.minPrice = initialPrice;
        this.maxPrice = initialPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
    }

    public String getPriceInformation() {
        return "Company: " + companyName + "\n" +
                "Current Price: " + currentPrice + "\n" +
                "Min Price: " + minPrice + "\n" +
                "Max Price: " + maxPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }
}
