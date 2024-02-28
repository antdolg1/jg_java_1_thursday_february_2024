package students.slava_subacius.lesson_3.level_2;

public class CarApp {

    public static void main(String[] args) {


        Car bmv = new Car("BMV", "black", 40000);
        Car nissan = new Car("Nissan", "red", 30000);
        Car ford = new Car("Ford", "Blue", 50000);

        System.out.println("Manufacturer = " + bmv.getManufacturer());
        System.out.println("Color = " + bmv.getColor());
        System.out.println("Price = " + bmv.getPrice());

        System.out.println("Manufacturer = " + nissan.getManufacturer());
        System.out.println("Color = " + nissan.getColor());
        System.out.println("Price = " + nissan.getPrice());

        System.out.println("Manufacturer = " + ford.getManufacturer());
        System.out.println("Color = " + ford.getColor());
        System.out.println("Price = " + ford.getPrice());

        bmv.setManufacturer("Audi");
        bmv.setColor("white");
        bmv.setPrice(45000);

        nissan.setManufacturer("Tojota");
        nissan.setColor("silver");
        nissan.setPrice(35000);

        ford.setManufacturer("Chevrolet");
        ford.setColor("black");
        ford.setPrice(34000);

        System.out.println("Manufacturer = " + bmv.getManufacturer());
        System.out.println("Color = " + bmv.getColor());
        System.out.println("Price = " + bmv.getPrice());

        System.out.println("Manufacturer = " + nissan.getManufacturer());
        System.out.println("Color = " + nissan.getColor());
        System.out.println("Price = " + nissan.getPrice());

        System.out.println("Manufacturer = " + ford.getManufacturer());
        System.out.println("Color = " + ford.getColor());
        System.out.println("Price = " + ford.getPrice());



    }
}
