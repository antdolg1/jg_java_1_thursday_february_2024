package students.kristina_manevica.lesson_3.homework.level_2;

public class CarApp {
    public static void main(String[] args) {

        Car carOne = new Car("Volvo", "grey", 14999.99);
        Car carTwo = new Car("KIA", "white", 24999.89);
        Car carThree = new Car("Skoda", "black", 34999.99);

        String carOneParameters = carOne.getBrand() + ", " + carOne.getColor() + ", " + carOne.getPrice() + "$";
        String carTwoParameters = carTwo.getBrand() + ", " + carTwo.getColor() + ", " + carTwo.getPrice() + "$";
        String carThreeParameters = carThree.getBrand() + ", " + carThree.getColor() + ", " + carThree.getPrice() + "$";

        System.out.println("First car: " + carOneParameters);
        System.out.println("Second car: " + carTwoParameters);
        System.out.println("Third car: " + carThreeParameters);

        carOne.setBrand("Nissan");
        carOne.setColor("red");
        carOne.setPrice(12000.99);

        carTwo.setBrand("Citroen");
        carTwo.setColor("green");
        carTwo.setPrice(11209.89);

        carThree.setBrand("Lexus");
        carThree.setColor("grey");
        carThree.setPrice(29999.99);
    }
}
