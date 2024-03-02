package students.aleksandra_hodjuka.lesson_5.level_2;
 class Task_15 {
     int[] numbers = new int[3];

     static int increasedNumbers(int[] numbers) {
         int increase = 0;
         for (int i = 0; i < numbers.length; i++)
             if (numbers[i] >= 0) numbers [i] += 1;
         return increase;

}
 }

