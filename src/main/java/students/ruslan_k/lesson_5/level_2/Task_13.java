package students.ruslan_k.lesson_5.level_2;

class IntsArrayWithRndValues {
    public static void main(String[] args) {
        int[] array= new int[3];
        int sum=0;
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*1000);
            sum+=array[i];
            System.out.printf("%s-й элемент массива есть %s\n", i+1, array[i]);
        }
        System.out.printf("Sum of all elements is %s\n", sum);
    }

}

