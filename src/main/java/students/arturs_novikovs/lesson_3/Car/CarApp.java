package students.arturs_novikovs.lesson_3.Car;

class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Bmw", "Red", 1500.00);
        Car car2 = new Car("Moskvich", "Orange", 2500.24);
        Car car3 = new Car("Subaru", "Green", 3542.14);

        System.out.println("1-st car is " + car1.getColor() + " " + car1.getMarka()+ " with price " + car1.getPrice() + " Lat");
        System.out.println("2-nd car is " + car2.getColor() + " " +car2.getMarka()+ " with price " + car2.getPrice() + " Lat");
        System.out.println("3-d car is " + car3.getColor() + " " + car3.getMarka()+ " with price " + car3.getPrice() + " Lat");

        car1.setMarka("Fiat");
        car1.setColor("Blue");
        car1.setPrice(2451.11);
        System.out.println("1-st Lot is changed:");
        System.out.println("1-st car is " + car1.getColor() + " " + car1.getMarka()+ " with price " + car1.getPrice() + " Lat");
        System.out.println("All others is unchanged");
        System.out.println("2-nd car is " + car2.getColor() + " " +car2.getMarka()+ " with price " + car2.getPrice() + " Lat");
        System.out.println("3-d car is " + car3.getColor() + " " + car3.getMarka()+ " with price " + car3.getPrice() + " Lat");
    }
}
