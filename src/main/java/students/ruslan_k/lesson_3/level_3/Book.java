package students.ruslan_k.lesson_3.level_3;
class Book{
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

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    String getBookName() {
        return bookName;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getAuthor() {
        return author;
    }

    void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    int getYearOfPublish() {
        return yearOfPublish;
    }

    class ChapterOfBook {
        String chapName;
        String chapText;

        ChapterOfBook(String chapName, String chapText) {
            this.chapName=chapName;
            this.chapText=chapText;
        }

        String getChapName() {
            return chapName;
        }

        String getChapText() {
            return chapText;
        }

        void setChapText(String chapText) {
            this.chapText = chapText;
        }

        void setChapName(String chapName) {
            this.chapName = chapName;
        }
    }

}