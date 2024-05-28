package students.arturs_novikovs.lesson_5.level_2;

public class AverageValuePlusTwo {
    public static void main(String[] args) {
        int[] array= new int[3];
        int sum;
        sum = 0;
        double average;
        for(int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            sum += array[i];
            System.out.printf("%s-й элемент массива %s\n", i + 1, array[i]);
        }
        System.out.println();
        for (int i=0;i<array.length;i++){
            array[i]+= 2;
            System.out.printf("%s-й элемент массива %s/n", i+1, array[i]);
        }

    }
}
