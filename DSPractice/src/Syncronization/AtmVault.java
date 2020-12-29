package Syncronization;

public class AtmVault {
    private float balance = 65000.00f;

    public void withdraw(float amount){
        if(amount <= balance) {
            this.balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }

    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public float getBalance(){
        return this.balance;
    }

}

