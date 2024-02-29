package students.aleksandra_hodjuka.lesson_3.level_3;

 class Book {
    String title;
    String author;
    String yearOfPrint;
    String chapter1;
    String chapter2;
    private String text1;
    private String text2;


    Book(String title, String author, String yearOfPrint, String chapter1, String text1, String chapter2, String text2) {
        this.title = title;
        this.author = author;
        this.yearOfPrint = yearOfPrint;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
        this.text1 = text1;
        this.text2 = text2;


        class Chapter1 {
            String chapterTitle1;
            String text1;

            Chapter1(String chapterTitle1, String text1) {
                this.chapterTitle1 = chapterTitle1;
                this.text1 = text1;
            }

            class Chapter2 {
                String chapterTitle2;
                String text2;

                Chapter2(String chapterTitle2, String text2) {
                    this.chapterTitle2 = chapterTitle2;
                    this.text2 = text2;
                }

            }
        }

    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getYearOfPrint() {return this.yearOfPrint;
    }
    public String getChapter1() {return this.chapter1;};

    public String getChapter2() {
        return this.chapter2;
    }
    public String getChapterTitle1() {return this.chapter1;}
    public String getChapterTitle2() {
        return this.chapter2;
    }

    public String getText1() {return this.text1;}
    public String getText2() {return this.text2;}

}
