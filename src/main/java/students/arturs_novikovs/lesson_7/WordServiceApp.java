package students.arturs_novikovs.lesson_7;

class WordServiceApp {
    public static void main(String[] arg) {
        WordService wordServ = new WordService();
        String text = "Конечно эту задачу можно решить в лоб не разбивая на более\n" +
                "маленькие подзадачи. В реальных проектах более сложные задачи\n" +
                "в лоб решать будет гораздо сложнее. Поэтому давайте учиться\n" +
                "разбивать наши задачи на более простые. Будем учиться применять\n" +
                "принцип разделяй и властвуй. Любую более сложную задачу можно\n" +
                "разбить на более маленькие подзадачи. Решать маленькие подзадачи\n" +
                "намного проще чем решать одну большую сложную задачу";
        String result;
        result = wordServ.findMostFrequentWord(text);
        System.out.println("Чаще всего встречается слово \"" + result + "\"");

    }

}
