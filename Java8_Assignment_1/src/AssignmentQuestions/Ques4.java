package AssignmentQuestions;
class EkClass{
    String s ="";
    EkClass(){
        s="Any  Default value";
        System.out.println("Default Constructor Called");
    }
    EkClass(String s){
        this.s=s;
        System.out.println("Parameter Constructor is    Called");
    }
}
interface Interface_1{
    public EkClass func();
}
interface Interface_2{
    public EkClass func(String s);
}
public class Ques4 {
    public static void main(String[] args) {
    Interface_1 obj1 = EkClass::new;
    obj1.func();
        Interface_2 obj2 = EkClass::new;
        obj2.func("Aryan");
    }
}
