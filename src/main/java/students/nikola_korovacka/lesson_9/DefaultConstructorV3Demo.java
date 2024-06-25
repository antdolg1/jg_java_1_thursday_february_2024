package students.nikola_korovacka.lesson_9;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 object = new DefaultConstructorV3();
        System.out.println("Full Name: " + object.getFullName()); // null
        System.out.println("Age: " + object.getAge()); // 0
        System.out.println("Is Male: " + object.isMale()); // false
        System.out.println("Is Female: " + object.isFemale()); // null
    }
}
