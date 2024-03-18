package students.aleksandra_hodjuka.lesson_3.level_3;


public class BookApp {
    public static void main(String[] args) {

        Chapter chapter1 = new Chapter("Chapter 1", "Main idea of the book.");
        Chapter chapter2 = new Chapter("Chapter 2", "The plot of the book.");
        Book book1 = new Book("Fourth Wing", "Rebecca Yarros", "2023", chapter1);

        Chapter chapter1A = new Chapter("Chapter 1", "The desert.");
        Chapter chapter2A = new Chapter("Chapter 2", "Never outline the master.");
        Book book2 = new Book("The 48 Laws of Power", "Robert Greene", "2000", chapter2);


        System.out.println("Book 1 title is  " + book1.getTitle());
        System.out.println("Book 1 author is  " + book1.getAuthor());
        System.out.println("Book 1 is printed in   " + book1.getYearOfPrint());
        System.out.println("Book 1 first chapter is called  " + book1.getChapter().getChapterTitle());
        System.out.println("Book 1 first chapter text is   " + book1.getChapter().getText());

        System.out.println("Book 2 title is  " + book2.getTitle());
        System.out.println("Book 2 author is  " + book2.getAuthor());
        System.out.println("Book 2 is printed in   " + book2.getYearOfPrint());
        System.out.println("Book 2 first chapter is called  " + book2.getChapter().getChapterTitle());
        System.out.println("Book 2 first chapter text is   " + book2.getChapter().getText());
    }
}
