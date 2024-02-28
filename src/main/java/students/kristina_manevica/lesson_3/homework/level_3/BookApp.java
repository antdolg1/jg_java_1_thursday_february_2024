package students.kristina_manevica.lesson_3.homework.level_3;

class BookApp {
    public static void main(String[] args) {

        Chapter firstChapterBookOne = new Chapter("Paul", "I'm Paul Atreides!");
        Chapter secondChapterBookOne = new Chapter("Emperor", "I'm Your Imperor!");

        Chapter firstChapterBookTwo = new Chapter("Scarlett", "After all, tomorrow is another day.");
        Chapter secondChapterBookTwo = new Chapter("Rhett", "I don't give a damn.");

        Book bookOne = new Book("Dune", "F.Herbert", 1963, firstChapterBookOne, secondChapterBookOne);
        Book bookTwo = new Book("Gone with the Wind", "M.Mitchel", 1936, firstChapterBookTwo,
                secondChapterBookTwo);

        String firstBookParameters = bookOne.getTitle() + ", " + bookOne.getAuthor() + ", " + bookOne.getYear();
        String secondBookParameters = bookTwo.getTitle() + ", " + bookTwo.getAuthor() + ", " + bookTwo.getYear();

        String firstBookFirstChapter = firstChapterBookOne.getChapterTitle() + ", " + firstChapterBookOne.getText();
        String firstBookSecondChapter = secondChapterBookOne.getChapterTitle() + ", " + secondChapterBookOne.getText();
        String secondBookFirstChapter = firstChapterBookTwo.getChapterTitle() + ", " + firstChapterBookTwo.getText();
        String secondBookSecondChapter = secondChapterBookTwo.getChapterTitle() + ", " + secondChapterBookTwo.getText();

        System.out.println("First book: " + firstBookParameters);
        System.out.println("Chapter one: " + firstBookFirstChapter);
        System.out.println("Chapter two: " + firstBookSecondChapter);

        System.out.println("");

        System.out.println("Second book: " + secondBookParameters);
        System.out.println("Chapter one: " + secondBookFirstChapter);
        System.out.println("Chapter two: " + secondBookSecondChapter);
    }
}
