package students.ruslan_k.lesson_9.level_1;

public class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 dcV3 = new DefaultConstructorV3();
        System.out.println("Default constructor creating variables with follows values: ");
        System.out.println("Type String - " + dcV3.getFullName());
        System.out.println("Type int - " + dcV3.getAge());
        System.out.println("Type boolean - " + dcV3.isMale());
        System.out.println("Type Boolean - " + dcV3.getFemale());

    }


}
