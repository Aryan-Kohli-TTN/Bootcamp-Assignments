package myPackage;
abstract class MobilePhone {
    abstract public void print();
}
class Android_phone extends MobilePhone{
    @Override
    public void print(){
        System.out.println("Android Phone");
    }

}
class Apple_phone extends MobilePhone{
    @Override
    public void print(){
        System.out.println("Apple Phone");
    }
}
class Userr {
    private MobilePhone  mobilePhone ;
    Userr(String mobileType){
        if(mobileType.equals("Android")){
            mobilePhone = new Android_phone();
        } else if (mobileType.equals("Apple")) {
            mobilePhone = new Apple_phone();
        }
    }
    public MobilePhone getMobilePhone(){
        return mobilePhone;
    }
}
public class question4 {
    public static void main(String[] args) {
        Userr u1 = new Userr("Android");
        MobilePhone m1 = u1.getMobilePhone();
        m1.print();
        Userr u2 = new Userr("Apple");
        MobilePhone m2 = u2.getMobilePhone();
        m2.print();
    }
}
