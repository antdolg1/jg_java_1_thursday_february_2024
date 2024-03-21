package students.arturs_novikovs.lesson_3.Doctor;


import java.util.Objects;
import java.util.Scanner;

class DocVisitApp {
    public static void main(String[] args) {
        String[] doc1Name = {"Гиппократ", "Фредди", "Моя мама", "Евгений", "Айболит"};
        String[] doc2Name = {"Великий", "Крюгер", "Святая женщина", "Демичев", ""};
        String[] docSpec = {"Мастер античной медицины", "пластический хирург", "Психиатрия", "Хирург", "Изотерик"};
        String[] docVisitHours = {"10:00-12:00", "14:00-16:00"};

        int[][] visitCheck = {{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}};

        Scanner scan = new Scanner(System.in); //

        DocVisit[] visit = new DocVisit[10];
        String toBeCont;
        int visitCount = 0;
        boolean isWork = true;

        while (isWork) {
            System.out.println("1. Начать/Продолжить запись");
            System.out.println("2. Посмотреть записи");
            System.out.println("3. Изменить запись");
            System.out.println("4. Завершение трудового дня");
            System.out.print("Выбор за Вами: ");
            int selectJob = scan.nextInt();
            String temp = scan.nextLine();
            switch (selectJob) {
                case 1:
//--------------------------------Start visit list----------------------------------------------------------------------
                    toBeCont="y";
                    while (!Objects.equals(toBeCont, "n") && visitCount < 10) {
                        visit[visitCount] = new DocVisit();
//--------------------------------Make selection of Doc to visit--------------------------------------------------------
                        System.out.println("/--------------------------------------");
                        System.out.println("Сегодня возможна запись на прием к следующим ведущим специалистам:");

                        for (int i = 0; i < doc1Name.length; i++)
                            System.out.printf("%s. %s %s, %s\n", i + 1, doc1Name[i], doc2Name[i], docSpec[i]);

                        System.out.println("/-------------------------------------");
                        System.out.print("Выберите специалиста: ");

                        int docSelect = scan.nextInt();
                        temp = scan.nextLine();
//--------------------------------------------------------------------------------------------------
                        if (docSelect > 0 && docSelect <= doc1Name.length)
                        {
                            if (visitCheck[docSelect - 1][0] != 0 || visitCheck[docSelect - 1][1] != 0)
                            {
                                visit[visitCount].setDocFirstName(doc1Name[docSelect - 1]);
                                visit[visitCount].setDocSecName(doc2Name[docSelect - 1]);
                                visit[visitCount].setProfile(docSpec[docSelect - 1]);

                                System.out.println("На завтра ");
                                if (visitCheck[docSelect - 1][0] != 0)
                                    System.out.println("Есть запись " + docVisitHours[0]);
                                if (visitCheck[docSelect - 1][1] != 0)
                                    System.out.println("Есть запись " + docVisitHours[1]);
//------------------------------------------------------------------------------------------------------------
                                System.out.print("Выберите часы приема (AM/PM): ");
                                String visitSelect = scan.nextLine();
                                if (Objects.equals(visitSelect, "AM"))
                                {
                                    if (visitCheck[docSelect - 1][0] != 0)
                                    {
                                        visit[visitCount].setAmVisit(true);
                                        visitCheck[docSelect - 1][0] = 0;
                                        visitSelect = "10:00-12:00";
                                    }
                                    else
                                    {
                                        visit[visitCount].setPmVisit(true);
                                        visitCheck[docSelect - 1][1] = 0;
                                        visitSelect = "14:00-16:00";
                                        System.out.println("Сорян, запись только на " + visitSelect);
                                    }
                                }
                                if (Objects.equals(visitSelect, "PM"))
                                {
                                    if (visitCheck[docSelect - 1][1] != 0)
                                    {
                                        visit[visitCount].setPmVisit(true);
                                        visitCheck[docSelect - 1][1] = 0;
                                        visitSelect = "14:00-16:00";
                                    }
                                    else
                                    {
                                        visit[visitCount].setAmVisit(true);
                                        visitCheck[docSelect - 1][0] = 0;
                                        visitSelect = "10:00-12:00";
                                        System.out.println("Сорян, запись только на " + visitSelect);
                                    }
                                }
                                //else
                                  //  System.out.println("Ну не тупи... AM/PM! Братан соберись");

                                System.out.println("Заполните свои данные:");
                                System.out.print("First Name: ");
                                visit[visitCount].client.setClientFirstName(scan.nextLine());
                                System.out.print("Second Name: ");
                                visit[visitCount].client.setClientSecName(scan.nextLine());
                                System.out.print("Diagnose: ");
                                visit[visitCount].client.setDiagnose(scan.nextLine());
                                visit[visitCount].client.setVisitPrice(125.45);

                                System.out.println("------------------------------");
                                System.out.printf("Больной %s %s записан(а) %s к врачу %s %s на часы %s с диагнозом %s \n", visit[visitCount].client.getClientFirstName(), visit[visitCount].client.getClientSecName(), visit[visitCount].getVisitDate(), visit[visitCount].getDocFirstName(), visit[visitCount].getDocSecName(), visitSelect, visit[visitCount].client.getDiagnose());
                                System.out.printf("Цена приема: %s \n", visit[visitCount].client.getVisitPrice());
                                System.out.printf("Специальность врача: %s\n", visit[visitCount].getProfile());
                                visit[visitCount].setVisitNr(visitCount);
                                System.out.printf("Номер записи - %s\n", visit[visitCount].getVisitNr());

                                visitCount++;

                            } else
                                System.out.println("Бро, запись к этому спецу на сегодня закрыта");

                        }
                        else
                        {
                            System.out.println("Сорян, такого доктора нет");

                        }

                        System.out.print("Желаете еще кого-то записать (y/n) ? ");
                        toBeCont = scan.nextLine();
                        //if (Objects.equals(toBeCont, "y"))

                    }
                    break;
                case 2:
                    toBeCont = "y";
                    while (Objects.equals(toBeCont, "y")) {
                        System.out.print("Выберите номер записи для просмотра: ");
                        String visitTime;
                        int visitNr = scan.nextInt();
                        temp = scan.nextLine();
                        if (visitNr < visitCount) {
                            if (visit[visitNr].isAmVisit)
                                visitTime = "10:00-12:00";
                            else
                                visitTime = "14:00-16:00";
                            System.out.println("------------------------------");
                            System.out.printf("Больной %s %s записан(а) %s к врачу %s %s на часы %s с диагнозом %s \n", visit[visitNr].client.getClientFirstName(), visit[visitNr].client.getClientSecName(), visit[visitNr].getVisitDate(), visit[visitNr].getDocFirstName(), visit[visitNr].getDocSecName(), visitTime, visit[visitNr].client.getDiagnose());
                            System.out.printf("Цена приема: %s \n", visit[visitNr].client.getVisitPrice());
                            System.out.printf("Специальность врача: %s\n", visit[visitNr].getProfile());
                            //visit[visitCount].setVisitNr(visitNr);
                            System.out.printf("Номер записи - %s\n", visit[visitNr].getVisitNr());
                        }
                        System.out.print("Смотрим ещё (y/n) ?");
                        toBeCont = scan.nextLine();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    isWork=false;
                    break;
            }
        }
    }
}