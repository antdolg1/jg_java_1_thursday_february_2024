package students.igors_melkins.lesson_9.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
//конструктор 
        Dog dog = new Dog(false,false,true,"Buddy","Grey");
        dog.bark();
        dog.eat();

        System.out.println("____");

        BabyDog babyDog = new BabyDog(false,false,true,"Tobby","black");
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();

        Cat cat = new Cat(false,false,false );
        cat.meow();
        cat.eat();
    }
}
