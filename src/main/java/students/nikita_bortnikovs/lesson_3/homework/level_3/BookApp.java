package students.nikita_bortnikovs.lesson_3.homework.level_3;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Desert Racers","Wandy Jilliams",2,2012);
        Book book2 = new Book("James In the Jungles","Andy Williams",5,2015);

        Book1Chapter1 Book1Chapter1 = new Book1Chapter1("First chpater of 1 book", "a lot of text from book 1 chapter 1 ");
        Book1Chapter2 Book1Chapter2 = new Book1Chapter2("Second chpater of 1 book", "a lot of text from book 1 chapter 2 ");


        String NameOfTheFirstBook = book1.getBookName();
        String AuthorOfTheFirst = book1.getAuthor();
        String FirstBookFirstChapterName = Book1Chapter1.getBook1chapter1Name();
        String FirstBookSecondChapter = Book1Chapter2.getBook1chapter2Name();

        System.out.println("First book name is " + NameOfTheFirstBook);
        System.out.println("First book author is " + AuthorOfTheFirst);
        System.out.println("First book  first chapter names  is " + FirstBookFirstChapterName);
        System.out.println("First book  second chapter names  is " + FirstBookSecondChapter);

    };
};
