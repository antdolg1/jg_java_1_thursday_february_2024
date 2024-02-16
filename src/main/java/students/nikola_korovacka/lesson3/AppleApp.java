package students.nikola_korovacka.lesson3;
class AppleApp {
    public static void main(String[] args) {
        Apple apple1 = new Apple("antonovka", "red", 100);
        Apple apple2 = new Apple("antonovka", "green", 50);
        Apple apple3 = new Apple("antonovka", "yellow", 60);

        System.out.println("Type = " + apple1.getType());
        System.out.println("Type = " + apple2.getType());
        System.out.println("Type = " + apple3.getType());

        System.out.println("Color = " + apple1.getColor());
        System.out.println("Color = " + apple2.getColor());
        System.out.println("Color = " + apple3.getColor());

        System.out.println("Weight = " + apple1.getWeight());
        System.out.println("Weight = " + apple2.getWeight());
        System.out.println("Weight = " + apple3.getWeight());

    }
}