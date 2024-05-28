package students.ruslan_k.lesson_9.level_2;

class Porsche911Demo {

    public static void main(String[] args) {

        Porsche911 p911 = new Porsche911(1901, 26);

        System.out.println("We have a Sport Car of our Dream !");
        System.out.println("This dutiful car is");
        System.out.println("---");
        System.out.printf("Porsche911 %d year, with TOP speed %d km/h\n", p911.getReleaseYear(), p911.getTopSpeed());

    }

}