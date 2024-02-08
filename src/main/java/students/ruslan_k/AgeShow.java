package students.ruslan_k;

import java.time.Year;
import java.util.Scanner;

public class AgeShow {
    public static void main(String[] args) {

            int currentYear = Year.now().getValue();
            int birthYear, age;
            String yearIndicator ="лет";
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите Ваше имя: ");
            String user_name=scan.nextLine();
            System.out.println("Привет, " + user_name);
            System.out.print(user_name + ", введите год рождения: ");
            birthYear = scan.nextInt();
            age=currentYear-birthYear;
            if(age>4 && age <21) yearIndicator="лет";
            else if (age%10 ==1) yearIndicator="год";
            else if(age%10 ==2 || age%10 ==3 || age%10 ==4) yearIndicator="года";

            System.out.println("Спасибо. Вам "+ age + " " + yearIndicator);
    }

}