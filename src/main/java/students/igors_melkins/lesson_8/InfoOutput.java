package students.igors_melkins.lesson_8;

public class InfoOutput {
    public static void main(String[] args) {

        System.out.println("Hello, World");
        System.out.println("Hello,");
        System.out.println("World");

        System.out.printf("Hello,%s! I am %d year old","John",29);
        float myFloat = 3.14f;
        int myInt = 12;

        String myString = "text";
        System.out.println("MyFloat value = %f,myInt value = %d,myString value = %s,myFloat,myInt,myString");
        System.out.println();
        System.err.println("An err occured!");

        String name = "Alice";

        String message = String.format("Hellom%s!,name");
        System.out.println(message);

        int day = 21;
        int month = 3;
        int year = 2024;

        String date = String.format("%02d/%02d/%d,day,month,year");
        System.out.println(date);

        double discount = 0.2;
        String discountString = String.format("Discount : %0f%%",discount * 100);
        System.out.println(discountString);

    }
}
