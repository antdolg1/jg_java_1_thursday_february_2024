package students.ruslan_k.lesson_3.level_4;


import java.util.Objects;
import java.util.Scanner;

public class DocVisitApp {
    public static void main(String[] args) {
        String[] doc1Name={"Виктор","Фредди","Миньоны","Яга","Айболит"};
        String[] doc2Name={"Франкенштейн","Крюгер","(команда)","(баба)",""};
        String[] docSpec={"паталогоанатом","пластический хирург","окулисты","гастроэндокринолог","психоаналитик"};
        String[] docVisitHours={"10:00-12:00","14:00-16:00"};

        int[][] visitCheck={{1,1},{1,1},{1,1},{1,1},{1,1}};

        Scanner scan =new Scanner(System.in);

        DocVisit[] visit= new DocVisit[10];
        String toBeCont="y";
        int visitCount=0;
//--------------------------------Start visit list----------------------------------------------------------------------
        while(!Objects.equals(toBeCont, "n") && visitCount<10) {
            visit[visitCount] = new DocVisit();
//--------------------------------Make selection of Doc to visit--------------------------------------------------------
            System.out.println("/--------------------------------------");
            System.out.println("Сегодня в нашей психушке идёт запись на прием к следующим ведущим специплистам:");

            for (int i = 0; i < doc1Name.length; i++)
                System.out.printf("%s. %s %s, %s\n", i + 1, doc1Name[i], doc2Name[i], docSpec[i]);

            System.out.println("/-------------------------------------");
            System.out.print("Выберите специалиста: ");

            int docSelect = scan.nextInt();
            String temp=scan.nextLine();
//--------------------------------------------------------------------------------------------------
            if(visitCheck[docSelect-1][0]!=0 || visitCheck[docSelect-1][1]!=0 ) {
                if (docSelect > 0 && docSelect <= doc1Name.length) {
                    visit[visitCount].setDocFirstName(doc1Name[docSelect - 1]);
                    visit[visitCount].setDocSecName(doc2Name[docSelect - 1]);
                    visit[visitCount].setProfile(docSpec[docSelect - 1]);

                    System.out.println("На эту дату ");
                    if (visitCheck[docSelect-1][0]!=0)
                        System.out.println("Есть запись " + docVisitHours[0]);
                    if (visitCheck[docSelect-1][1]!=0)
                        System.out.println("Есть запись " + docVisitHours[1]);
                    if (visit[0].isAmVisit && visit[0].isPmVisit)
                        System.out.println("Записи больше нет");

                    System.out.print("Выберите часы приема (AM/PM): ");
                    String visitSelect=scan.nextLine();
                    if (Objects.equals(visitSelect, "AM")){
                        visit[visitCount].isAmVisit=true;
                        visitCheck[docSelect-1][0]=0;
                        visitSelect="10:00-12:00";
                    }
                    else if (Objects.equals(visitSelect, "PM")) {
                        visit[visitCount].isPmVisit=true;
                        visitCheck[docSelect-1][1]=0;
                        visitSelect="14:00-16:00";
                    }
                    else
                        System.out.println("Вы будете записаны в начальную школу дла изучения понятий AM/PM");
//--------------------------------------
                    System.out.println("Заполните свои данные:");
                    System.out.print("First Name: ");
                    visit[visitCount].client.setClientFirstName(scan.nextLine());
                    System.out.print("Second Name: ");
                    visit[visitCount].client.setClientSecName(scan.nextLine());
                    System.out.print("Diagnose: ");
                    visit[visitCount].client.setDiagnose(scan.nextLine());
                    visit[visitCount].client.setVisitPrice(125.45);

                    System.out.println(visit[0].client.getClientFirstName());
                    System.out.println("------------------------------");
                    System.out.printf("Больной %s %s записан(а) %s к врачу %s %s на часы %s с диагнозом %s \n", visit[visitCount].client.getClientFirstName(), visit[visitCount].client.getClientSecName(), visit[visitCount].getVisitDate(), visit[visitCount].getDocFirstName(), visit[visitCount].getDocSecName(), visitSelect,visit[visitCount].client.getDiagnose());
                    System.out.printf("Цена приема: %s \n", visit[visitCount].client.getVisitPrice());
                    System.out.printf("Специальность врача: %s\n", visit[visitCount].getProfile());
                    visit[visitCount].setVisitNr(visitCount);
                    System.out.printf("Номер записи - %s\n", visit[visitCount].getVisitNr());


                }
                else
                    System.out.println("Извините, такого доктора еще не завезли, обратитесь позже");

            }
            else {
                System.out.println("Извините, запись к этому спецу на сегодня закрыта");
            }


            System.out.print("Желаете еще кого-то записать (y/n) ? ");
            toBeCont=scan.nextLine();
            if (Objects.equals(toBeCont, "y"))
                visitCount++;
        }

    }

}
