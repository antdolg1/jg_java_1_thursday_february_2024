package students.nikola_korovacka.lesson3;

public class Car {
    // vērtības
    private String brand; // Marka
    private String color; // Krāsa
    private double price; // Cena

    // Konstruktors
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
    // Metodes, lai uzstādītu jaunas vērtības atribūtiem
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
