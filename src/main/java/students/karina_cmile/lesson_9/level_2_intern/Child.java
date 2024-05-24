package students.karina_cmile.lesson_9.level_2_intern;

public class Child extends Father {

    public Child() {
        super(parent1);
        System.out.println(parent1 + " + " + parent2 + " = Child");
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child);
    }
}
