package students.nikita_bortnikovs.lesson_3.homework.level_2;

public class CarApp {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "Black", 1000);
        Car car2 = new Car("BMW", "Red", 2000);
        Car car3 = new Car("KIA", "White", 500);

        String carBrand1 = car1.getBrand();
        String carColour1 = car1.getColour();
        int carPrice1 = car1.getPrice();

        System.out.println(carBrand1 + carColour1 + carPrice1);
        car2.setBrand("Toyota");
        System.out.println(car2.getBrand());
    }
}
