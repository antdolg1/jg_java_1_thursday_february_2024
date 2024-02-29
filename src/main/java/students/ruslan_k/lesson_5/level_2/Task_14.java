package students.ruslan_k.lesson_5.level_2;

class IntsArrayWithAverageOutput{
    public static void main(String[] args) {
        int[] array= new int[3];
        int sum=0;
        double average;
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*1000);
            sum+=array[i];
            System.out.printf("%s-й элемент массива есть %s\n", i+1, array[i]);
        }
        average=sum/3.0;
        System.out.printf("Average of all elements is %s\n", average);
    }

}

