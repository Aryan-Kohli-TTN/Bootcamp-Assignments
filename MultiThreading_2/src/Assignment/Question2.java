package Assignment;

import java.util.concurrent.locks.ReentrantLock;

// creating a deadlock
class BankAccount{
    int money;
    String accountno ;
    ReentrantLock lock;
    public BankAccount(String accountno, int money) {
        this.accountno = accountno;
        this.money = money;
        lock = new ReentrantLock();
    }
    public int getMoney() {
        return money;
    }
    public String getAccountno() {
        return accountno;
    }
    public ReentrantLock getLock() {
        return lock;
    }

    public void moneyTransfer(BankAccount receiver,int money){
        ReentrantLock receiverLock = receiver.getLock();

        while (true){
            boolean b1 = this.lock.tryLock();
            boolean b2 = receiverLock.tryLock();
            if(b1 && b2)
                break;
            else if(b1)
                this.lock.unlock();
            else if(b2)
                receiverLock.unlock();
        }
        System.out.println(this.accountno +" --->> "+receiver.accountno +" ----- "+money);
        this.lock.unlock();
        receiverLock.unlock();
    }
}
public class Question2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("cudb",100000);
        BankAccount b2 = new BankAccount("fusg",100000);

        Thread t1 = new Thread(()->{
            for (int i=0;i<10;i++)
            {
                b1.moneyTransfer(b2,10000);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<5;i++)
            {
                b2.moneyTransfer(b1,20000);
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
    }
}
