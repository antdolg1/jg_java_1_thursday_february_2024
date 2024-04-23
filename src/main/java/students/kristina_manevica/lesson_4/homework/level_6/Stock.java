package students.kristina_manevica.lesson_4.homework.level_6;

class Stock {

    public String name;
    public int currentPrice;
    public int minPrice;
    public int maxPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void updatePrice(int newPrice){
        currentPrice = newPrice;
        minPrice = newPrice < minPrice ? newPrice : minPrice;
        maxPrice = newPrice > maxPrice ? newPrice : maxPrice;
    }

    public String getPriceInformation(){
        return "Company = " + getName() + ", Current Price = " + getCurrentPrice() + ", Min Price = " + getMinPrice() + ", Max Price = " + getMaxPrice();
    }

}
