package students.aleksandra_hodjuka.lesson_3.level_7;

class Dog {
    String nickname;
    int age;
    static String text = "My nickname is ";


    String getNickname() {
        return nickname;
    }

    int getAge() {
        return age;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    String dogBarks() {
        return text;
    }

    int celebrateDogsBirthday() {
        age++;

        return age;
    }

    Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;


    }

}
