package Syncronization;

public class ThreadedSend extends Thread{

    private AtmVault atmvault;

    public ThreadedSend(AtmVault av) {
        this.atmvault = av;
    }
    public void run(){
            atmvault.withdraw((int)Math.random()*500);
            atmvault.withdraw((int)Math.random()*200);
    }

    public void wd(int amoutn){

        //synchronized (atmvault){
            System.out.println("inside wd = "+amoutn);
            atmvault.withdraw(amoutn);
            System.out.println("amount = "+atmvault.getBalance());
        //}
    }

    public void dd(int amoutn){
        //synchronized (atmvault){
            System.out.println("inside dd = "+amoutn);
            atmvault.deposit(amoutn);
        System.out.println("amount = "+atmvault.getBalance());
        //}
    }

}
