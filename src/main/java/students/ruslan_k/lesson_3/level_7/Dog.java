package students.ruslan_k.lesson_3.level_7;

class Dog {
    String nickname;
    int age;

    Dog(String nickname, int age){
        this.nickname=nickname;
        this.age=age;
    }
    public String getNickname() {
        return "My nickname is " + nickname;
    }
    int getAge(){
        return this.age;
    }
    void setNewYear(){
        this.age++;
    }
}

class DogLife{
    public static void main(String[] args) {
        Dog myDog = new Dog("Tuzik", 1);

        System.out.println(myDog.getNickname() + " and I is " + myDog.getAge() + " year(s) old");
        myDog.setNewYear();
        System.out.println("Now I one year older! And now I'm " + myDog.getAge());
    }
}