package students.ruslan_k.lesson_3.level_2;

class Car {
    String marka;
    String color;
    double price;

    Car(String marka, String color, double price){
        this.marka=marka;
        this.color=color;
        this.price=price;
    }

    String getColor() {
        return color;
    }

    String getMarka() {
        return marka;
    }

    double getPrice() {
        return price;
    }
    void setMarka(String marka){
        this.marka=marka;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
