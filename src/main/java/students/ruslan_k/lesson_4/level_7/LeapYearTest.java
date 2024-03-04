package students.ruslan_k.lesson_4.level_7;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        int[] yearTest ={1700,1704,2000,2010};
        boolean[] answers={false,true,true,false};
        for(int i=0; i<yearTest.length;i++){
            System.out.printf("Year %s, test is %s\n", yearTest[i],
                    year.isLeapYear(yearTest[i])==answers[i]? "Passed": "Failed");
        }
    }

}
