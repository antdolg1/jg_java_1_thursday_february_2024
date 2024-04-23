package students.igors_melkins.lesson_9.abstraction;

public  abstract class Animal {
    protected String name ;

    public Animal(String name) {
        this.name = name ;

    }
    public void  sleep (){
        System.out.println(name + "sleeps");
    }

    abstract void  makeSound();

}
