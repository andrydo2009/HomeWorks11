import java.time.LocalDate;
//import java.util.Scanner;


public class Main{
    public static void getLeapYear(int year)
    {
        if (year%4==0 && year%100!=0 || year%400==0)
        {System.out.println(" год является високосным!");}
        else {System.out.println(" год не является високосным!");};

    }

    public static void getClientOS(int name, int Year)
    {
        int currentYear = LocalDate.now().getYear();
        if (name == 1)
        { System.out.println("Операционная система на вашем устройстве Android"); }
        else if (name == 0)
        { System.out.println("Операционная система на вашем устройстве IOS"); }
        if (currentYear < Year)
        { System.out.println("Установите lite-версию для вашего  устройства " ); }
        else { System.out.println("Установите обычную версию для вашего устройства "); }
    }

    public static int checkDeliveryParameter(int distance)
    {
        int day=0;
        if (distance<20)
            day = 1;
        if (distance>20 && distance<60)
            day = 2;
        if (distance>60 && distance<=100)
            day = 3;
        return day;

    }


    public static void main(String[] args)

    {
        System.out.println(" ");
        System.out.println("Mission 11.1");
        int currentYear = LocalDate.now().getYear();
        /*System.out.println("Введите  год - ");
        Scanner scan=new Scanner(System.in);
        int currentYear = scan.nextInt();*/
        System.out.print(currentYear);
        getLeapYear(currentYear);





        System.out.println(" ");
        System.out.println("Mission 11.2");


        /*Scanner scan=new Scanner(System.in);
        System.out.println("Введите год выпуска вашего устройства - ");
        int clientYearGadget= scan.nextInt();
        System.out.println("Нажмите 1 для Android или 0 для iOS ");
        int osName= scan.nextInt();*/
        int clientYearGadget=2001;
        int osName=0;
        getClientOS(osName,clientYearGadget);
        getClientOS(osName,clientYearGadget);


        System.out.println(" ");
        System.out.println("Mission 11.3");

        //System.out.println("Введите расстояние до ближайшего к вам отделения банка");
        //Scanner scan=new Scanner(System.in);
        //int deliveryDistance = scan.nextInt();
        int deliveryDistance = 90;
        System.out.println("Срок доставки в днях составит "+ checkDeliveryParameter(deliveryDistance));



    }



}
