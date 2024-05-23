package students.igors_melkins.lesson_3.level_2;

import com.sun.jdi.DoubleValue;

public class CarApp {

    public static void main(String[] args) {

        Car Car1 = new Car("Audi","White",10000);
        Car Car2 = new Car("Fiat","Black",50000);
        Car Car3 = new Car("Tayota","Blue",42500);

        System.out.println( "Car1 brand  = " + Car1.getBrand());
        System.out.println( "Car1 colour = " + Car1.getColour());
        System.out.println( "Car1 price = " + Car1.getPrice());

        System.out.println( "Car2 brand  = " + Car2.getBrand());
        System.out.println( "Car2 colour  = " + Car2.getColour());
        System.out.println( "Car2 price  = " + Car2.getPrice());

        System.out.println( "Car3 brand  = " + Car3.getBrand());
        System.out.println( "Car3 colour  = " + Car3.getColour());
        System.out.println( "Car3 price  = " + Car3.getPrice());

        Car1.setBrand("BMW");
        Car1.setColour("Red");
        Car1.setPrice(1000_00) ;




        Car2.setBrand("Opel");
        Car2.setColour("Black");
        Car2.setPrice(3500_00);

        Car3.setBrand("Nissan");
        Car3.setColour("Green");
        Car3.setPrice(15000_00);

        System.out.println("Car1 new Brand = " + Car1.getBrand());
        System.out.println("Car1 new Colour = " + Car1.getColour());
        System.out.println("Car1 new Price = " + Car1.getPrice());

        System.out.println("Car2 new Brand = " + Car2.getBrand());
        System.out.println("Car2 new Colour = " + Car2.getColour());
        System.out.println("Car2 new Price = " + Car2.getPrice());

        System.out.println("Car3 new Brand = " + Car3.getBrand());
        System.out.println("Car3 new Colour = " + Car3.getColour());
        System.out.println("Car3 new Price = " + Car3.getPrice());




    }
}
