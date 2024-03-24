package students.kristina_manevica.lesson_3.homework.level_7;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark() {
        System.out.println("My nickname is " + name);
    }

    public void celebrateBirthday() {
        this.age = this.age + 1;
    }

    public void sayMyName() {
        System.out.println("I'm " + age + " years");
    }
}
