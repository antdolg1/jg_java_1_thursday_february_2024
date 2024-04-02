package students.aleksandra_hodjuka.lesson_3.level_7;

 class DogApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Shabby", 1);
        dog1.dogBarks();
        System.out.println(dog1.dogBarks() + dog1.getNickname());
        System.out.println("Dog's age is " + dog1.getAge());
        dog1.celebrateDogsBirthday();
        System.out.println("Shabby celebrates it's birthday! " + dog1.getAge());
        dog1.getAge();
        System.out.println("Dog's age is " + dog1.getAge());
        dog1.celebrateDogsBirthday();
        System.out.println("Shabby celebrates it's birthday! " + dog1.getAge());
        dog1.getAge();
        System.out.println("Dog's age is " + dog1.getAge());
        dog1.celebrateDogsBirthday();
        System.out.println("Shabby celebrates it's birthday! " + dog1.getAge());

    }


}
