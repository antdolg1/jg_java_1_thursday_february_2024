package students.ruslan_k.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            if(i==50){
                break;
            }
            System.out.println(i++);
        }
    }
}

class ForLoopContinue{
    public static void main(String[] args) {
        for(int i=0; i<100;i++){
            if(i==50){
                break;
            }
            System.out.println(i);
        }
    }
}
