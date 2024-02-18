package students.karina_cmile.lesson_3.homework.level_2_intern;

public class Car {
    private String brand;
    private String colour;
    private int price;

    public Car(String brand, String colour, int price) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getColour() {
        return colour;
    }
    public int getPrice() { return price; }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
