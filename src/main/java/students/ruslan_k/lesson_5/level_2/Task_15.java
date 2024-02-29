package students.ruslan_k.lesson_5.level_2;

class IntsArrayWithChanges{
    public static void main(String[] args) {
        int[] array= new int[3];
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*1000);

            System.out.printf("%s-й элемент массива есть %s\n", i+1, array[i]);
        }
        int i=1;
        for(int arrayElement: array){
            arrayElement=arrayElement+2;
            System.out.printf("Новый %s-й элемент массива есть %s (проверка %s)\n", i, arrayElement, array[i-1]);
            i++;
        }
        for(i=0; i<array.length; i++){
           System.out.printf("%s-й элемент массива есть %s\n", i+1, array[i]);
        }
    }

}
