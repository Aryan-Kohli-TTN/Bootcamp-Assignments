package practice;

import java.util.Scanner;

import static java.lang.System.exit;

class Circle{
    public static double Calculate_Area(float r){
        return 3.14*r*r;
    }
    public static double Calculate_Circum(float r){
        return 2*3.14*r;
    }
}
public class question3 {
    public static void main(String[] args) {
        while (true){
            System.out.println("****MENU****");
            System.out.println("1. Calculate Area");
            System.out.println("2. Calculate Circumference");
            System.out.println("3. Exit");
            System.out.print("Choose an Option : ");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option){
                case 3:
                    exit(0);
                    break;
                case 1:
                {
                    System.out.print("Enter Radius : ");
                    int radius = sc.nextInt();
                    System.out.println("AREA : "+ Circle.Calculate_Area(radius));
                    break;
                }
                case 2:
                {
                    System.out.print("Enter Radius : ");
                    int radius = sc.nextInt();
                    System.out.println("Circumference : "+ Circle.Calculate_Circum(radius));
                    break;
                }
            }

        }
    }
}
