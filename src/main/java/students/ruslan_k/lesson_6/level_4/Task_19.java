package students.ruslan_k.lesson_6.level_4;

class WhileInfiniteLoop19 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Infinite While Break");
            break;
        }
    }
}

class ForInfiniteLoop19 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Infinite For Break");
            break;
        }
    }
}

