package students.aleksandra_hodjuka.lesson_3.level_3;


public class BookApp {
    public static void main(String[] args) {

        Book Book1 = new Book("Fourth Wing", "Rebecca Yarros", "2023");
        Chapter Chapter1 = new Chapter("Chapter 1", "Main idea of the book.");
        Chapter Chapter2 = new Chapter("Chapter 2", "The plot of the book.");


        Book Book2 = new Book("The 48 Laws of Power", "Robert Greene", "2000");
        Chapter Chapter1A = new Chapter("Chapter 1", "The desert.");
        Chapter Chapter2A = new Chapter("Chapter 2", "Never outline the master.");

        System.out.println(" Book 1 title is  " + Book1.title);
        System.out.println(" Book 1 author is  " + Book1.author);
        System.out.println(" Book 1 is printed in   " + Book1.yearOfPrint);
        System.out.println(" Book 1 first chapter is called  " + Chapter1.chapterTitle);
        System.out.println(" Book 1 first chapter text is   " + Chapter1.getText());
        System.out.println(" Book 1 second chapter is called  " + Chapter2.chapterTitle);
        System.out.println(" Book 1 second chapter text is   " + Chapter2.getText());


        System.out.println(" Book 2 title is  " + Book2.title);
        System.out.println(" Book 2 author is  " + Book2.author);
        System.out.println(" Book 2 is printed in   " + Book2.yearOfPrint);
        System.out.println(" Book 2 first chapter is called  " + Chapter1A.chapterTitle);
        System.out.println(" Book 2 first chapter text is   " + Chapter1A.getText());
        System.out.println(" Book 2 second chapter is called  " + Chapter2A.chapterTitle);
        System.out.println(" Book 2 second chapter text is   " + Chapter2A.getText());
    }
}
