package teacher.lesson_10.lessoncode.private_method_in_interface;

public interface MyInterface {

    void myMethod();

    default void defaultMethodA() {
        commonMethod();
        System.out.println("default method A");
    }

    default void defaultMethodB() {
        commonMethod();
        System.out.println("default method B");
    }

    private void commonMethod() {
        System.out.println("starting machine...");
    }
}
