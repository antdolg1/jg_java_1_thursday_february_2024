package students.aleksandra_hodjuka.lesson_3.level_2;


public class CarApp {
    public static void main(String[] args) {

        Car Car1 = new Car("Opel", "Red", 20000.00);
        Car Car2 = new Car("Kia", "Blue", 27000.00);
        Car Car3 = new Car("Nissan", "Black", 30000.00);

        System.out.println(" Car1 Model = " + Car1.getModel());
        System.out.println(" Car1 Model = " + Car1.getColor());
        System.out.println(" Car1 Model = " + Car1.getPrice());

        System.out.println(" Car2 Model = " + Car2.getModel());
        System.out.println(" Car2 Model = " + Car2.getColor());
        System.out.println(" Car2 Model = " + Car2.getPrice());

        System.out.println(" Car3 Model = " + Car3.getModel());
        System.out.println(" Car3 Model = " + Car3.getColor());
        System.out.println(" Car3 Model = " + Car3.getPrice());

        Car1.setModel("Fiat");
        Car1.setColor("White");
        Car1.setPrice(Double.valueOf("40000.00"));

        Car2.setModel("BMV");
        Car2.setColor("Red");
        Car2.setPrice(Double.valueOf("50000.00"));

        Car2.setModel("Dacia");
        Car2.setColor("Brown");
        Car2.setPrice(Double.valueOf("15000.00"));

        System.out.println("Car 1 new model = " + Car1.getModel());
        System.out.println("Car 1 new color = " + Car1.getColor());
        System.out.println("Car 1 new price = " + Car1.getPrice());
        System.out.println("Car 2 new model = " + Car2.getModel());
        System.out.println("Car 2 new color = " + Car2.getColor());
        System.out.println("Car 2 new price = " + Car2.getPrice());

        System.out.println("Car 3 new model = " + Car3.getModel());
        System.out.println("Car 3 new color = " + Car3.getColor());
        System.out.println("Car 3 new price = " + Car3.getPrice());


    }
}
