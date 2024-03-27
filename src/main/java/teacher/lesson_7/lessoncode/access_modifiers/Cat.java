package teacher.lesson_7.lessoncode.access_modifiers;

import java.util.Objects;

public class Cat {

    private int age;
    private String nickname;

    public Cat(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Cat's age cannot be negative number!");
        } else if (age > 25) {
            System.out.println("Cat's usually don't live that long! Please check your input data!");
        } else {
            this.age = age;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(nickname, cat.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nickname);
    }
}
