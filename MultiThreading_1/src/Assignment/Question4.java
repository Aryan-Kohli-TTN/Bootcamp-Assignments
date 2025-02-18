package Assignment;
// creating a deadlock
class BankAccount{
    int money;
    String accountno ;
    Object lock;
    public BankAccount(String accountno, int money) {
        this.accountno = accountno;
        this.money = money;
        lock = new Object();
    }
    public int getMoney() {
        return money;
    }
    public String getAccountno() {
        return accountno;
    }
    public Object getLock() {
        return lock;
    }

    public void moneyTransfer(BankAccount receiver,int money){
        Object receiverLock = receiver.getLock();
        synchronized (this.lock){
            System.out.println("Sender Lock of "+this.getAccountno());
            synchronized (receiverLock){
                System.out.println("Recivers Lock of "+this.getAccountno());
                this.money-=money;
                receiver.money+=money;
            }
        }
    }
}
public class Question4 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("cudb",100000);
        BankAccount b2 = new BankAccount("fusg",100000);

        Thread t1 = new Thread(()->{
            for (int i=0;i<100000;i++)
            {
                b1.moneyTransfer(b2,1);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<100000;i++)
            {
                b2.moneyTransfer(b1,1);
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println("exception");
        }
        System.out.println( b1.getMoney()+b2.getMoney());
        // the program will never stop because both of them puts lock in reverse order
    }
}
