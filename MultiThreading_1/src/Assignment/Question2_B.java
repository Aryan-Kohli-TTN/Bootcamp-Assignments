package Assignment;
// using synchronize methods
class ABC{
    public int a =0;

    public void func(int type){
        System.out.println(Thread.currentThread().getName()+" entered.");
        synchronized (this){
            if(type==1) {
                a++;
            }
            else
                a--;
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("exception");
            }

        }
        System.out.println(Thread.currentThread().getName()+" exited.");

    }
}
public class Question2_B {
    public static void main(String[] args) throws InterruptedException{
        ABC obj = new ABC();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                obj.func(1);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
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
