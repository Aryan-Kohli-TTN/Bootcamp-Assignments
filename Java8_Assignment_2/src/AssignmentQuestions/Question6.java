package AssignmentQuestions;

import java.time.*;
import java.time.zone.ZoneRulesException;
import java.util.Locale;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        LocalDateTime todayDateTime = LocalDateTime.now();
        ZonedDateTime india = todayDateTime.atZone(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime africa = todayDateTime.atZone(ZoneId.of("Africa/Nairobi"));
        ZonedDateTime america = todayDateTime.atZone(ZoneId.of("America/New_York"));

        System.out.println(india);
        System.out.println(africa);
        System.out.println(america);
        String Date1="";
        String Date2="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date of format (YYYY-MM-DD)");
        System.out.println("Enter date 1: ");
        Date1 = sc.nextLine();
        System.out.println("Enter date 2: ");
        Date2 = sc.nextLine();

        LocalDate d1 = LocalDate.parse(Date1);
        LocalDate d2 = LocalDate.parse(Date2);

        Period p1 = Period.between(d1,d2);
        if(p1.isNegative()){
            System.out.println("date 2 comes before");
        }
        else
            System.out.println("date 1 comes before");




    }
}
