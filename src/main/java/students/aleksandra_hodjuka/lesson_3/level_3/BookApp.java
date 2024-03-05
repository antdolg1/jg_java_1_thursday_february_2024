package students.aleksandra_hodjuka.lesson_3.level_3;


public class BookApp {
    public static void main(String[] args) {

        Book book1 = new Book("Fourth Wing", "Rebecca Yarros", "2023","Chapter 1");
        Chapter chapter1 = new Chapter("Chapter 1", "Main idea of the book.");
        Chapter chapter2 = new Chapter("Chapter 2", "The plot of the book.");


        Book book2 = new Book("The 48 Laws of Power", "Robert Greene", "2000","Chapter 2");
        Chapter chapter1A = new Chapter("Chapter 1", "The desert.");
        Chapter chapter2A = new Chapter("Chapter 2", "Never outline the master.");

        System.out.println(" Book 1 title is  " + book1.title);
        System.out.println(" Book 1 author is  " + book1.author);
        System.out.println(" Book 1 is printed in   " + book1.yearOfPrint);
        System.out.println(" Book 1 first chapter is called  " + chapter1.chapterTitle);
        System.out.println(" Book 1 first chapter text is   " + chapter1.getText());
        System.out.println(" Book 1 second chapter is called  " + chapter2.chapterTitle);
        System.out.println(" Book 1 second chapter text is   " + chapter2.getText());


        System.out.println(" Book 2 title is  " + book2.title);
        System.out.println(" Book 2 author is  " + book2.author);
        System.out.println(" Book 2 is printed in   " + book2.yearOfPrint);
        System.out.println(" Book 2 first chapter is called  " + chapter1A.chapterTitle);
        System.out.println(" Book 2 first chapter text is   " + chapter1A.getText());
        System.out.println(" Book 2 second chapter is called  " + chapter2A.chapterTitle);
        System.out.println(" Book 2 second chapter text is   " + chapter2A.getText());
    }
}
