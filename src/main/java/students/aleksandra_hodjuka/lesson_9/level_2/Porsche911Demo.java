package students.aleksandra_hodjuka.lesson_9.level_2;
class Porsche911Demo {
    public static void main(String[] args) {
        Porsche911 myPorsche = new Porsche911(2023,250);

        System.out.println("Year of manufacture"+ myPorsche.getReleaseYear());
        System.out.println("Top speed "+myPorsche.getTopSpeed());

    }
}
