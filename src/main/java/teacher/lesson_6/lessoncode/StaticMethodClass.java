package teacher.lesson_6.lessoncode;

public class StaticMethodClass {

    int nonStaticVariable = 1;
    static int staticVariable = 3;

    public void nonStaticMethod() {
        System.out.println("I am non static method");
    }

    static void staticMethod(int localVariable) {
        System.out.println("localVariable = " + localVariable);
        System.out.println("staticVariable = " + staticVariable);
        //Мы не можем обращаться к нестатической переменной из статического контекста
//        System.out.println("nonStaticVariable = " + nonStaticVariable);
    }

    public static void main(String[] args) {
        staticMethod(22);
        //Мы не можем обращаться к нестатическому методу из статического контекста
//        nonStaticMethod();
        StaticMethodClass staticMethodClass = new StaticMethodClass();
        staticMethodClass.staticMethod(22);
        StaticMethodClass.staticMethod(22);

    }
}

