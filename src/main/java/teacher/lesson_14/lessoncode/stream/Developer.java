package teacher.lesson_14.lessoncode.stream;

public class Developer {

    private String name;
    private int age;
    private Level level;

    public Developer(String name, int age, Level level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Developer [" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                ']';
    }
}
