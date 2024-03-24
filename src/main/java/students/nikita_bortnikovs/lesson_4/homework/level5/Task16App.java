package students.nikita_bortnikovs.lesson_4.homework.level5;

import java.util.Scanner;

public class Task16App {
    public static void main(String[] args) {
        System.out.println("Please enter  wave length to get colour");
        Scanner scanner = new Scanner(System.in);
        int waveLength = scanner.nextInt();
        if (waveLength <=0) {
            System.out.println("Something went wrong");
        } else if(waveLength >0 && waveLength <= 379 || waveLength >= 751) {
            System.out.println("Invisible Light");
        } else if(waveLength >=380 && waveLength <= 449) {
            System.out.println("Violet");
        }else if(waveLength >=450 && waveLength <= 494) {
            System.out.println("Blue");
        }else if(waveLength >=495 && waveLength <= 569) {
            System.out.println("Green");
        }else if(waveLength >=570 && waveLength <= 589) {
            System.out.println("Yellow");
        }else if(waveLength >=590 && waveLength <= 619) {
            System.out.println("Orange");
        }else if(waveLength >=620 && waveLength <= 750) {
            System.out.println("Red");
        }
    }
}



