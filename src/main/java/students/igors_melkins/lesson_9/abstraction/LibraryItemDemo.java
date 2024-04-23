package students.igors_melkins.lesson_9.abstraction;

public class LibraryItemDemo {
    public static void main(String[] args) {

        Book book1 = new Book("LOTR","Talkien");
        double Book1Fee = book1.calculateLAteFee(12);
        System.out.println("Late fee for LOTR book for 12 days is : " + Book1Fee);
        book1.displayInformation();

        DVD dvd1 = new DVD("Matrix","Vachuoyvsky");
        dvd1.displayInformation();
    }
}
