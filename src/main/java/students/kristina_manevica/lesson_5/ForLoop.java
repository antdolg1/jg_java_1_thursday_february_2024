package students.kristina_manevica.lesson_5;

class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Can be delitj by 10");
            }
            System.out.println("Test Nr" + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i value is " + i);
        }

        for (int i = 100; i > 0; i--) {
            System.out.println("i value is " + i);
        }
    }
}
