package teacher.lesson_7.lessoncode.objects_equality;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) { //Проверка, являются ли объекты одним и тем же объектом. Ссылаются ли на один и тот же объект.
//            return true;
//        }
//
//        if (obj == null || getClass() != obj.getClass()) { //Проверка, являются ли объекты разных классов или obj равен null
//            return false;
//        }
//
//        Person person = (Person) obj; //приведение (casting) obj к типу Person
//
//        return age == person.age && Objects.equals(name, person.name);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 20);
        Person person2 = new Person("Alice", 20);

        boolean areEqual = person1.equals(person2);

        System.out.println("Are the objects equal? " + areEqual);
        System.out.println(person1);

//        String name = "John";
//        String name2 = new String("John");
//        System.out.println("name value is: " + name);
//        System.out.println("name2 value is: " + name2);
//        System.out.println(name == name2);
    }
}
