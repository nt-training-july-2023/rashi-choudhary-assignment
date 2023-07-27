package ThreadTask;
// The same program as bankDemo but without synchronization and the output is inconsistent;
public class TestSynchronization {
    public static void main(String[]args){

        BankThread1 th1=new BankThread1(10000,"Deposit");
        th1.setName("Deposit_Thread1");
        BankThread1 th2=new BankThread1(20000,"Deposit");
        th2.setName("Deposit_Thread2");
        BankThread1 th3=new BankThread1(30000,"Deposit");
        th3.setName("Deposit_Thread3");
        BankThread1 th4=new BankThread1(5000,"Withdraw");
        th4.setName("Withdraw_Thread4");
        BankThread1 th5=new BankThread1(10000,"Withdraw");
        th5.setName("Withdraw_Thread5");
        BankThread1 th6=new BankThread1(20000,"Withdraw");
        th6.setName("Withdraw_Thread6");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }

}


class BankThread1 extends Thread{

    double amount;
    String action;
    double accountBalance;
    public BankThread1(double amount,String action){
        this.amount=amount;
        this.action=action;

    }
    @Override
    public void run() {
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


