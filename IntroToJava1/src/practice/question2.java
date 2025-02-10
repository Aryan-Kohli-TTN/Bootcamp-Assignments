package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String line ;
        while (true){
            line = sc.nextLine();
            if(line.equals("XDONE"))
            {
                break;
            }
            lines.add(line);
        }
        System.out.println("Entered Text is : ");
        for(String l : lines) {
            System.out.println(l);
        }
    }
}
