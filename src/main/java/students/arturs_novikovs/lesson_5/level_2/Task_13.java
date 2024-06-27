package students.arturs_novikovs.lesson_5.level_2;
public class Task_13 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int sum = 0;
        for (int i=0;i<array.length; i++ ){
            array[i]=(int) (Math.random()*100);
            sum+=array[i];
            System.out.printf("%s-й элемент массива %s\n",i+1,array[i]);
        }
        System.out.printf("Сумма всех элементов массива ровна - %s\n", sum);
    }
}