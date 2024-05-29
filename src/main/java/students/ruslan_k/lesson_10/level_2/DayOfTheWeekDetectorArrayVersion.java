package students.ruslan_k.lesson_10.level_2;

public class DayOfTheWeekDetectorArrayVersion  implements DayOfTheWeek{
    @Override
    public String detectDayName(int number){
        String[] dayOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if(number>0 && number<=7){
            return dayOfWeek[number-1];
        }
        return "Please input a valid number between 1 and 7";

    }
}
