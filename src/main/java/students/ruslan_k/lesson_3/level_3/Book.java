package students.ruslan_k.lesson_3.level_3;
public class Book{
    String bookName;
    String author;
    int yearOfPublish;
    ChapterOfBook chapter1;
    ChapterOfBook chapter2;


    Book(String bookName, String author, int yearOfPublish, String chapName, String chapText, String chap2Name, String chap2Text){
        this.bookName=bookName;
        this.author=author;
        this.yearOfPublish=yearOfPublish;
        chapter1=new ChapterOfBook(chapName,chapText);
        chapter2=new ChapterOfBook(chap2Name, chap2Text);
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public class ChapterOfBook {
        String chapName;
        String chapText;

        ChapterOfBook(String chapName, String chapText) {
            this.chapName=chapName;
            this.chapText=chapText;
        }

        public String getChapName() {
            return chapName;
        }

        public String getChapText() {
            return chapText;
        }

        public void setChapText(String chapText) {
            this.chapText = chapText;
        }

        public void setChapName(String chapName) {
            this.chapName = chapName;
        }
    }

}