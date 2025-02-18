package Assignment;
// using synchronize methods
class AB{
    public int a =0;

    public synchronized void func(int type){
        if(type==1)
            a++;
        else
            a--;
    }
}
public class Question2_A {
    public static void main(String[] args) throws InterruptedException{
        AB obj = new AB();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                obj.func(1);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                obj.func(2);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(obj.a);
    }
}
