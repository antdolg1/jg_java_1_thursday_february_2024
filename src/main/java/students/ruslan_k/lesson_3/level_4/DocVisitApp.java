package students.ruslan_k.lesson_3.level_4;


import java.util.Scanner;

public class DocVisitApp {
    public static void main(String[] args) {
        String[] doc1Name={"Виктор","Фредди","Миньоны","Яга","Айболит"};
        String[] doc2Name={"Франкенштейн","Крюгер","(команда)","(баба)",""};
        String[] docSpec={"паталогоанатом","пластический хирург","окулисты","гастроэндокринолог","психоаналитик"};
        String[] docVisitHours={"10:00-12:00","14:00-16:00"};

        Scanner scan =new Scanner(System.in);

        DocVisit visit=new DocVisit();

        System.out.println("/--------------------------------------");
        System.out.println("Сегодня в нашей идёт запись на прием к следующим ведущим специплистам:");

        for(int i=0; i< doc1Name.length; i++)
            System.out.printf("%s. %s %s, %s\n", i+1,doc1Name[i],doc2Name[i],docSpec[i]);

        System.out.println("/-------------------------------------");
        System.out.print("Выберите специалиста: ");

        int docSelect= scan.nextInt();
        if(docSelect>0 && docSelect<=doc1Name.length)
        {
            visit.setDocFirstName(doc1Name[docSelect-1]);
            visit.setDocSecName(doc2Name[docSelect-1]);
            visit.setProfile(docSpec[docSelect-1]);
        }
        else
            System.out.println("Извините, такого доктора еще не завезли, обратитесь позже");

        System.out.print("Введите желаемую дату приема в формате ДД.ММ.ГГГГ: ");
        String visitData=scan.nextLine();

        visit.setVisitDate(visitData);

        System.out.println("На эту дату ");
        if(!visit.isAmVisit)
            System.out.println("Есть запись "+ docVisitHours[0]);
        if(!visit.isPmVisit)
            System.out.println("Есть запись "+ docVisitHours[1]);
        if(visit.isAmVisit && visit.isPmVisit)
            System.out.println("Записи больше нет");


        System.out.print("Client name: ");
        visit.client.setClientFirstName(scan.nextLine());
        System.out.print("Client Second Name: ");
        visit.client.setClientSecName(scan.nextLine());
        System.out.print("Diagnose: ");
        visit.client.setDiagnose(scan.nextLine());
        visit.client.setVisitPrice(125.45);
        //if(visit.)
        System.out.println(visit.client.getClientFirstName());
        System.out.println("------------------------------");
        System.out.printf("Больной %s %s записан(а) %s к врачу %s %s на часы с диагнозом %s \n",visit.client.getClientFirstName(), visit.client.getClientSecName(),visit.getVisitDate(),visit.getDocFirstName(),visit.getDocSecName(),visit.client.getDiagnose());
        System.out.printf("Цена приема: %s \n",visit.client.getVisitPrice());
        System.out.printf("Специальность врача: %s\n",visit.getProfile());


    }
}
