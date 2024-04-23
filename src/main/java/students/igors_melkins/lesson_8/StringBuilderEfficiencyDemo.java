package students.igors_melkins.lesson_8;

public class StringBuilderEfficiencyDemo {
    public static void main(String[] args) {

        int iterations = 100000;
        //Direct string contatenation
        long startTime1 = System.currentTimeMillis();
        String result = "";
        for (int i=0;i <iterations;i++) {
            result +=i + " ";
        }
        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;

        System.out.println("Direct string concatenation time:" + duration1 + "ms");
        //StringBuilder
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i <iterations;i++){
            sb.append(i).append(" ");
        }
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;

        System.out.println("Using StringBuilder time :" + duration2 + "ms");


    }
}
