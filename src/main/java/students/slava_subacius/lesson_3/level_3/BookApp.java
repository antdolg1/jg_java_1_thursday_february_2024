package students.slava_subacius.lesson_3.level_3;

public class BookApp {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter","Joanne Rowling",2022,"House Riddle", "Scar");
        System.out.println("Book title = " + book1.getTitle());
        System.out.println("Book author = " + book1.getAuthor());
        System.out.println("Book releaseYear = " + book1.getReleaseYear());
        System.out.println("Book chapter1 = " + book1.getChapter1());
        System.out.println("Book chapter2 = " + book1.getChapter2());


        Book book2 = new Book("Mysterious Island", "Jules Verne" , 1983 ,"Castaways" ,"Mystery of the Island");
        System.out.println("Book title = " + book2.getTitle());
        System.out.println("Book author = " + book2.getAuthor());
        System.out.println("Book releaseYear = " + book2.getReleaseYear());
        System.out.println("Book chapter1 = " + book2.getChapter1());
        System.out.println("Book chapter2 = " + book2.getChapter2());

    }
}
