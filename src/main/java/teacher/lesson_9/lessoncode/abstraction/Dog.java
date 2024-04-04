package teacher.lesson_9.lessoncode.abstraction;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says woof woof");
    }
}
