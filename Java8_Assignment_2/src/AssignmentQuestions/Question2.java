package AssignmentQuestions;

import java.util.function.Consumer;

interface MyInterface{
    static void func(){
        System.out.println("I am Static");
    }
    default void func2(int a){
        if(a%2==0)
        System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
public class Question2 {
    public static void main(String[] args) {
        MyInterface.func();

        MyInterface obj = new MyInterface() {};
        obj.func2(1432);
    }
}
