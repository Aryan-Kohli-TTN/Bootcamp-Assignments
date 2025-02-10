package myPackage;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

class User{
    private String firstName;
    private String lastName;
    private String phone;
    private int age;
    public User(String firstName, int age, String phone, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.phone = phone;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return String.format("%s %s %d %s",firstName,lastName,age,phone);
    }
}
public class question2 {
    public static void main(String[] args) {
        File file = new File("/home/aryan/IdeaProjects/IntroToJava2/src/myPackage/userdata.txt");

        Scanner sc = new Scanner(System.in);
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
                while (true){
                    String firstName , lastName,phone;
                    int age;
                    System.out.print("Enter FirstName: ");
                    firstName=sc.nextLine();
                    System.out.print("Enter LastName: ");
                    lastName=sc.nextLine();
                    System.out.print("Enter Phone no. : ");
                    phone=sc.nextLine();
                    System.out.print("Enter age: ");
                    age=Integer.parseInt(sc.nextLine());
                    System.out.println(firstName+lastName+age+phone);
                    User user = new User(firstName,age,phone,lastName);
                    br.write(user.toString());
                    br.newLine();
                    System.out.println("Do you want to exit? (Type QUIT to exit)");
                    String s ;
                    s=sc.nextLine();
//                    System.out.println(s);

                    if(s.equals("QUIT")){
                        System.out.println("EXITING..");
                        break;
                    }


                }
        }
        catch (FileNotFoundException e){
            System.out.println("Output file not found");
        }
        catch (IOException e){
            System.out.println("Error in writing to file");
        }

    }
}
