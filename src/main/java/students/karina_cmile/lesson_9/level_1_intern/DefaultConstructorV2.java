package students.karina_cmile.lesson_9.level_1_intern;

public class DefaultConstructorV2 {
    String myName;

    // My name
    public DefaultConstructorV2 (String myName) {
        this.myName = myName;
        System.out.println(myName);
    }

    // My unknown young age
    public DefaultConstructorV2() {
        System.out.println("Always young!");
    }
}
