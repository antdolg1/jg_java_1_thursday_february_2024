package students.arturs_novikovs.lesson_3.Book;

class BookApp {

    public static void main(String[] args) {

        Book firstBook = new Book("Flowers for Algernon", "Daniel Keyes",
                1959,"First report","Hero's diary","Second report", "About my self");
        Book secondBook = new Book("Animal farm", "George Orwell", 1945,
                "Farm","Animalizm","Power grab","Animals laws");

        System.out.println("First book is "+firstBook.getBookName()+", Author " + firstBook.getAuthor());
        System.out.println("Year of publishing: "+ firstBook.getYearOfPublish());
        System.out.println("Contain chapters: "+ firstBook.chapter1.getChapName()+". "+firstBook.chapter1.getChapText()+ " and "+firstBook.chapter2.getChapName()+". "+firstBook.chapter2.getChapText());

        System.out.println("Second book is "+secondBook.getBookName()+", Author " + secondBook.getAuthor());
        System.out.println("Year of publishing: "+ secondBook.getYearOfPublish());
        System.out.println("Contain chapters: "+ secondBook.chapter1.getChapName()+". "+secondBook.chapter1.getChapText()+ " and "+secondBook.chapter2.getChapName()+". "+secondBook.chapter2.getChapText());


        firstBook.setBookName("Animal farm");
        System.out.println("New Book");
        System.out.println(firstBook.getBookName());

    }
}
