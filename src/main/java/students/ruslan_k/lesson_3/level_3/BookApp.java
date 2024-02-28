package students.ruslan_k.lesson_3.level_3;

class BookApp {

    public static void main(String[] args) {

        Book firstBook = new Book("Treasure Island", "Robert Louis Balfour Stevenson",
                1883,"First","Introduction","Second", "...");
        Book secondBook = new Book("ABC", "Folks", 1200,
                "Uno","Vini Vidi Vici","Duo","Amat Victoria Curam");

        System.out.println("First book is "+firstBook.getBookName()+", Author " + firstBook.getAuthor());
        System.out.println("Year of publishing: "+ firstBook.getYearOfPublish());
        System.out.println("Contain chapters: "+ firstBook.chapter1.getChapName()+". "+firstBook.chapter1.getChapText()+ " and "+firstBook.chapter2.getChapName()+". "+firstBook.chapter2.getChapText());

        System.out.println("Second book is "+secondBook.getBookName()+", Author " + secondBook.getAuthor());
        System.out.println("Year of publishing: "+ secondBook.getYearOfPublish());
        System.out.println("Contain chapters: "+ secondBook.chapter1.getChapName()+". "+secondBook.chapter1.getChapText()+ " and "+secondBook.chapter2.getChapName()+". "+secondBook.chapter2.getChapText());


        firstBook.setBookName("ABC");
        System.out.println("New Book");
        System.out.println(firstBook.getBookName());

    }
}
