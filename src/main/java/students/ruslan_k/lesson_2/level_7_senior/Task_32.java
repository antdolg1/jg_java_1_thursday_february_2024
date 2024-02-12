package students.ruslan_k.lesson_2.level_7_senior;

import java.time.Year;
import java.util.Scanner;

class AgeShow {
    public static void main(String[] args) {

            int currentYear = Year.now().getValue();
            int birthYear, age;
            String yearIndicator ="лет"; //set age postfix (???) to "лет"
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите Ваше имя: "); //Ask client's name
            String user_name=scan.nextLine();
            System.out.println("Привет, " + user_name);
            System.out.print(user_name + ", введите год рождения: "); //Ask client's year of birth
            birthYear = scan.nextInt();
            age=currentYear-birthYear;
            /*
            Если воэраст лежит в пределах 1-3 применяется существительное "год"
            если 5-20 - "лет"
            21,31.41... (т.е. остаток от деления на 10 = 1) - "год"
            остаток от деления на 10 = 2, 3, 4 - "года"
            Остальное - "лет"
             */
            if(age>4 && age <21) yearIndicator="лет";
            else if (age%10 ==1) yearIndicator="год";
            else if(age%10 ==2 || age%10 ==3 || age%10 ==4) yearIndicator="года";

            System.out.println("Спасибо. Вам "+ age + " " + yearIndicator);
    }

}