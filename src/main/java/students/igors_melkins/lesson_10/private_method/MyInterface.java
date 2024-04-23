package students.igors_melkins.lesson_10.private_method;

public interface MyInterface {

    void myMethod();

    default  void defaultMethodA(){
        System.out.println("starting machine...");
        System.out.println("default method A");
    }

    default void defaultMethodB(){
        System.out.println("starting machine....");
        System.out.println("default method B");
    }

    private void  commonMethod(){
        System.out.println("starting machine...");
    }
}
