package myPackage;
class Singleton{
    private static Singleton s1;
    private Singleton(){}

    public static Singleton getInstance(){
        if(s1==null){
            s1=new Singleton();
        }
        return s1;
    }

}
public class question5 {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    if(obj1 == obj2){
    System.out.println("Single Object ");
    }
    }
}
