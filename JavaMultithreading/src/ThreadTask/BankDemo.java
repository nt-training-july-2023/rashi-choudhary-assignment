package ThreadTask;
//Create a program that simulates a banking application where updates on the account balance can happen simultaneously;
public class BankDemo {
    public static void main(String[]args){
        Bank bank=new Bank();
        BankThread th1=new BankThread(10000,bank,"Deposit");
        th1.setName("Deposit_Thread1");
        BankThread th2=new BankThread(20000,bank,"Deposit");
        th2.setName("Deposit_Thread2");
        BankThread th3=new BankThread(30000,bank,"Deposit");
        th3.setName("Deposit_Thread3");
        BankThread th4=new BankThread(5000,bank,"Withdraw");
        th4.setName("Withdraw_Thread4");
        BankThread th5=new BankThread(10000,bank,"Withdraw");
        th5.setName("Withdraw_Thread5");
        BankThread th6=new BankThread(20000,bank,"Withdraw");
        th6.setName("Withdraw_Thread6");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }

}
class Bank{
    int accountBalance;
    public void addAmount(double amount,String action){
        if(action.equals("Deposit")) {
            accountBalance += amount;
            System.out.println("Thread " + Thread.currentThread().getName() + " Make changes in account balance,amount "+ amount +" is added, the Account balance is " + accountBalance);
        }
        else {
            if(accountBalance-amount>0) {
                accountBalance -= amount;
                System.out.println("Thread " + Thread.currentThread().getName() + " Make changes in account balance,amount "+ amount +" is withdraw, the Account balance is " + accountBalance);
            }
            else {
                System.out.println(Thread.currentThread().getName()+" was trying to withdraw "+ amount+" from account balance "+accountBalance+" Withdraw is not possible");
            }
        }
    }
}
class BankThread extends Thread{
    Bank bank;
    double amount;
    String action;
public BankThread(double amount,Bank bank,String action){
    this.amount=amount;
    this.bank=bank;
    this.action=action;

}
    @Override
    public void run() {
        synchronized (bank){
            bank.addAmount(amount,action);
        }
    }
}

