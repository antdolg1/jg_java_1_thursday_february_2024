package students.arturs_novikovs.lesson_5.level_2;

public class AverageValue {
    public static void main(String[] args) {
        int[] array= new int[3];
        int sum=0;
        double average;
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*1000);
            sum+=array[i];
            System.out.printf("%s-й элемент массива %s\n", i+1, array[i]);
        }
        average=sum/(double)array.length;
        System.out.printf("Средние значение - %s\n", average);
    }

}