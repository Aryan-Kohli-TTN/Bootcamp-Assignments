package AssignmentQuestions;
interface Par1{
    default void display(){
        System.out.println("i am parent 1");
    }
}
interface Par2{
    default void display(){
        System.out.println("i am parent 2");
    }
}
class Child implements Par1,Par2{
    @Override
    public void display(){
        System.out.println("I am child");
        System.out.println("Now calling one parent");
        Par1.super.display();
        System.out.println("Now calling 2nd parent");
        Par2.super.display();
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
    }
}
