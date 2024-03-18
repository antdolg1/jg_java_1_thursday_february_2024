package students.kristina_manevica.lesson_3.homework.level_2;

class Car {

    private String brand;
    private String color;
    private double price;

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
