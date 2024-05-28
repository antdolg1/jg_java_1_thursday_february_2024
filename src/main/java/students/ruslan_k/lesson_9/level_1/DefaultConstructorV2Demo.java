package students.ruslan_k.lesson_9.level_1;

public class DefaultConstructorV2Demo {
    public static void main(String[] args) {
        DefaultConstructorV2 dcv2 = new DefaultConstructorV2();
        DefaultConstructor dc = new DefaultConstructor();

        boolean test = dc.booleanTest == dcv2.booleanTest;
        test = dc.intTest == dcv2.intTest && test;
        test = dc.stringTest == null && dcv2.stringTest == null && test;

        System.out.println("Is DC \"equals\" DCV2? Answer is " + (test ? "YES" : "No !!!"));
    }
}
