package students.igors_melkins.lesson_9.abstraction;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + "says meow meow");
    }
}
