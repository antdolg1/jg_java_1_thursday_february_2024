package students.aleksandra_hodjuka.lesson_3.level_3;

class Chapter {
    String chapterTitle;
    String Text;


    public Chapter(String chapterTitle, String text) {
        this.chapterTitle = chapterTitle;
        Text = text;
    }

    public String getChapterTitle() {
        return this.chapterTitle;
    }

    public String getText() {
        return this.Text;
    }
}