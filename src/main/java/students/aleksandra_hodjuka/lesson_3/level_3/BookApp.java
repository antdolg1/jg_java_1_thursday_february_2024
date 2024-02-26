package students.aleksandra_hodjuka.lesson_3.level_3;


public class BookApp {


    public static void main(String[] args) {


        Book Book1 = new Book("Fourth Wing ", "Rebecca Yarros"," year 2023", "chapter1",
                "Main idea of the book.", "chapter2", "The plot of the book.");

        Book Book2 = new Book("The 48 Laws of Power ", "Robert Greene", " year 2000", "chapter1",
                "The desert.", "chapter2", "Never Outshine the Master");

        System.out.println("Book 1 title is --- " + Book1.getTitle());
        System.out.println("The author is ---" + Book1.getAuthor());
        System.out.println("Printed in --- "  + Book1.getYearOfPrint());
        System.out.println("Chapter one is called --- " + Book1.getChapterTitle1());
        System.out.println( "Chapter's one text is --- " + Book1.getText1());
        System.out.println("Chapter two is called --- " + Book1.getChapterTitle2());
        System.out.println("Chapter's two text is --- " + Book1.getText2());


        System.out.println("Book 2 title is ---  " + Book2.getTitle());
        System.out.println("The author is ---" + Book2.getAuthor());
        System.out.println("Printed in --- "  + Book2.getYearOfPrint());
        System.out.println("Chapter one is called --- " + Book2.getChapterTitle1());
        System.out.println( "Chapter's one text is --- " + Book2.getText1());
        System.out.println("Chapter two is called --- " + Book2.getChapterTitle2());
        System.out.println("Chapter's two text is --- " + Book2.getText2());





    }


}
