package Assignment;
class MyThreadClass extends Thread{
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("MyThreadClass Thread is running "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("interepted exception");
            }
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
            MyThreadClass t1 = new MyThreadClass();

            Thread t2 = new Thread(()->{
                for (int i=0;i<10;i++){
                    System.out.println("Runnable Thread is running "+i);
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println("interepted exception");
                    }
                }
            });
            t1.start();
            t2.start();
            try{
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                System.out.println("interepedted exception");
            }
        System.out.println("All threads is executed");
    }
}
