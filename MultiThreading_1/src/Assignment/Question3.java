package Assignment;

public class Question3 {
    volatile int i=0;
    public static void main(String[] args) {
        Question3 obj = new Question3();
        Thread t1 = new Thread(()->{
            while (true){
                System.out.println(obj.i);
            }
        });
        Thread t2 = new Thread(()->{
            for (int k=0;k<10;k++){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.i=k+1;
            }
        });

        t1.start();
        t2.start();
    }
}
