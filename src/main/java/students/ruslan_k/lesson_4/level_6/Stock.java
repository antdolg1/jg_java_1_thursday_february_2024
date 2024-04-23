package students.ruslan_k.lesson_4.level_6;

class Stock {
    private String companyName;
    private int stockPrice;
    private int stockMaxPrice;
    private int stockMinPrice;

    Stock(String companyName, int stockPrice) {
        this.companyName = companyName;
        this.stockPrice = stockPrice;
        this.stockMaxPrice = stockPrice;
        this.stockMinPrice = stockPrice;
    }

    String getCompanyName() {
        return this.companyName;
    }

    int getStockPrice() {
        return this.stockPrice;
    }

    int getStockMaxPrice() {
        return this.stockMaxPrice;
    }

    int getStockMinPrice() {
        return this.stockMinPrice;
    }

    void updatePrice(int newPrice) {
        this.stockPrice = newPrice;
        this.stockMaxPrice = newPrice > this.stockMaxPrice ? newPrice : this.stockMaxPrice;
        this.stockMinPrice = newPrice < this.stockMinPrice ? newPrice : this.stockMinPrice;
    }

    String getPriceInformation() {
        return "Company = \"" + this.getCompanyName() + "\", Current price =" + this.stockPrice + ", MIN Price = " +
                this.stockMinPrice + ", MAX Price = " + this.stockMaxPrice;
    }


}
