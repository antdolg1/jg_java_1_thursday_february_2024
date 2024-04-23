package students.nikola_korovacka.lesson3;

public class CarApp {
    public static void main(String[] args) {
        // trīs mašīnas
        Car car1 = new Car("Toyota", "Red", 25000.00);
        Car car2 = new Car("BMW", "Black", 40000.00);
        Car car3 = new Car("Honda", "White", 30000.00);

        // Izvada informāciju par mašīnu
        System.out.println("Car 1:");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Price: " + car1.getPrice());

        // Maina marku, krāsu un cenu mašīnai car1
        car1.setBrand("Ford");
        car1.setColor("Blue");
        car1.setPrice(27000.00);

        // Izvada jauno informāciju par car1
        System.out.println("Updated Car 1:");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Price: " + car1.getPrice());

        System.out.println("Car 2:");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Price: " + car2.getPrice());

        System.out.println("Car 3:");
        System.out.println("Brand: " + car3.getBrand());
        System.out.println("Color: " + car3.getColor());
        System.out.println("Price: " + car3.getPrice());
    }
}

