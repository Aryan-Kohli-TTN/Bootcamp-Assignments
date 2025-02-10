package AssignmentQuestions;
interface EkInterface<T>{
    public T func(T a, T b);
}
class Operations{
    public int add (int a, int b){
        return (a+b);
    }
    public int Subract (int a, int b){
        return (a-b);
    }
    public static int Multiply (int a, int b){
        return (a*b);
    }
}
public class Ques2 {
    public static void main(String[] args) {
        Operations op = new Operations();
        EkInterface<Integer> ob1 = op::add;
        System.out.println(ob1.func(10,45));
        EkInterface<Integer> ob2 = op::Subract;
        System.out.println(ob2.func(10,45));
        EkInterface<Integer> ob3 = Operations::Multiply;
        System.out.println(ob3.func(10,45));
    }
}
