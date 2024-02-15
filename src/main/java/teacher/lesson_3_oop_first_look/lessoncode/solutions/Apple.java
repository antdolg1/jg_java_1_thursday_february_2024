package teacher.lesson_3_oop_first_look.lessoncode.solutions;

public class Apple {

    String sort;
    String color;
    int weight;

    Apple(String sort, String color, int weight) {
        this.sort = sort;
        this.color = color;
        this.weight = weight;
    }

    String getSort() {
        return sort;
    }

    String getColor() {
        return color;
    }

    int getWeight() {
        return weight;
    }

}
