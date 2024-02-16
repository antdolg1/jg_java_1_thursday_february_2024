package students.ruslan_k.lesson_3.level_2;

public class Car {
    String marka;
    String color;
    double price;

    Car(String marka, String color, double price){
        this.marka=marka;
        this.color=color;
        this.price=price;
    }

    public String getColor() {
        return color;
    }

    public String getMarka() {
        return marka;
    }

    public double getPrice() {
        return price;
    }
    void setMarka(String marka){
        this.marka=marka;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
