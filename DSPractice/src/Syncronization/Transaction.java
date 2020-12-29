package Syncronization;

public class Transaction implements Runnable{
    AtmVault acc = new AtmVault();
    public static void main(String args[])
    {
        Transaction trans = new Transaction();
        Thread t1 = new Thread(trans,"Thread 1");
        Thread t2 = new Thread(trans,"Thread 2");
        t1.start();
        t2.start();
    }

    public void run(){
        if(Thread.currentThread().getName().equals("Thread 1")){
            makeDeposit(5500.25f);
            makeDeposit(5325.35f);
        }else{
            makeWidth(20000.00f);
            makeWidth(5500.50f);
        }

    }

    private synchronized void makeWidth(float amount) {
        acc.withdraw(amount);
        System.out.println("Balance after withdrawing = "+acc.getBalance());
    }
    private synchronized void makeDeposit(float amount){
        acc.deposit(amount);
        System.out.println("Balance after depositing = "+acc.getBalance());
    }
}