package students.karina_cmile.lesson_3.lessoncode;

public class Apple {
   private String sort;
    private String color;
    private int weight;

    Apple(String sort, String color, int weight) {
        this.sort = sort;
        this.color = color;
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
