package students.igors_melkins.lesson_8;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); //пустой StringBuilder
        StringBuilder sbWithCapacity = new StringBuilder(50);//с определенным размером
        StringBuilder sbWithString = new StringBuilder("Initial text");// с каким-то текстом

//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        stringBuilder.append(",World");
//        System.out.println(stringBuilder.toString());

        StringBuilder stringBuilder = new StringBuilder("Hello, World");
        stringBuilder.replace(7,12,"Guys");

//        stringBuilder.insert(6,"Beautiful");
//        stringBuilder.delete(0,5);
//        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
