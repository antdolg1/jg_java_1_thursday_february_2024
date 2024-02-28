package students.karina_cmile.lesson_3.homework.level_2_intern;

import students.karina_cmile.lesson_3.homework.level_1_intern.Robot;

public class CarApp {
    public static void main(String[] args) {

        Car car1 = new Car ("Brand: Mercedes","Colour: Silver", 50000);
        Car car2 = new Car ("Brand: BMW","Colour: Black", 32000);
        Car car3 = new Car ("Brand: Audi","Colour: Red", 43000);

        System.out.println(car1.getBrand());
        System.out.println(car1.getColour());
        System.out.println(car1.getPrice());

        System.out.println(car2.getBrand());
        System.out.println(car2.getColour());
        System.out.println(car2.getPrice());

        System.out.println(car3.getBrand());
        System.out.println(car3.getColour());
        System.out.println(car3.getPrice());

        car1.setBrand("Brand: VW");
        System.out.println(car1.getBrand());
        car1.setColour("Colour: blue");
        System.out.println(car1.getColour());
        car1.setPrice(12555);
        System.out.println(car1.getPrice());

        car2.setBrand("Brand: Opel");
        System.out.println(car2.getBrand());
        car2.setColour("Colour: white");
        System.out.println(car2.getColour());
        car2.setPrice(11255);
        System.out.println(car2.getPrice());

        car3.setBrand("Brand: Toyota");
        System.out.println(car3.getBrand());
        car3.setColour("Colour: yellow");
        System.out.println(car3.getColour());
        car3.setPrice(12055);
        System.out.println(car3.getPrice());

    }
}
