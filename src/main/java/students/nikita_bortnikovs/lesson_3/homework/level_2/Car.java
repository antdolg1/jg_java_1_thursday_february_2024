package students.nikita_bortnikovs.lesson_3.homework.level_2;

public class Car {
    String brand;
    String colour;
    int price;

    Car(String brand,String colour, int price){
        this.brand = brand;
        this.colour = colour;
        this.price = (int) price;
    }
    String getBrand(){
        return this.brand;
    }
    String getColour(){
        return this.colour;
    }
    int getPrice(){
        return this.price;
    }

    void setBrand(String brand){
        this.brand = brand;

    }
}
