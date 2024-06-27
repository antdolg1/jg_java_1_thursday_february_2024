package students.arturs_novikovs.lesson_9.level_1;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        // Создание экземпляра класса DefaultConstructorV3 с использованием дефолтного конструктора
        DefaultConstructorV3 instance = new DefaultConstructorV3();

        // Печать значений свойств
        System.out.println("Full Name: " + instance.getFullName()); // null
        System.out.println("Age: " + instance.getAge()); // 0
        System.out.println("Male: " + instance.isMale()); // false
        System.out.println("Female: " + instance.getFemale()); // null
    }
}
