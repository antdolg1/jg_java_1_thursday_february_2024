package students.aleksandra_hodjuka.lesson_5.level_1;

class ArrayLength3 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }

    }


}
