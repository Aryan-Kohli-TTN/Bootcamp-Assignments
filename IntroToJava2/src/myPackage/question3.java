package myPackage;

import java.io.*;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        String fileName , word;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Path Name: ");
        fileName=sc.nextLine();
        System.out.print("Enter Word Name: ");
        word=sc.nextLine();
        int count=0;
        try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))){
                String line ;
                while ((line= br.readLine())!=null){
                    String[] words = line.split(" ");
                    for(String w: words){
                        if(w.equals(word)){
                            count++;
                        }
                    }
                }

                System.out.println("Count of words is : "+count);


        }
        catch (FileNotFoundException e){
            System.out.println("File not founded");
        }
        catch (IOException e){
            System.out.println("Error in reading data");
        }

    }
}
