package ThreadTask;

import java.util.Scanner;

public class ThreadPriority {
    public static void main(String[]args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        MultiplicationTable th1=new MultiplicationTable(num1);
        MultiplicationTable th2=new MultiplicationTable(num2);
        th1.setPriority(2);
        th2.setPriority(1);
        System.out.println("The Priority of thread th1 is "+th1.getPriority());
        System.out.println("The Priority of thread th2 is "+th2.getPriority());
        th1.start();
        Thread.sleep(200);
        th2.start();
        scanner.close();
    }

}
class MultiplicationTable extends Thread{
    int num;
    public MultiplicationTable(int num){
        this.num=num;
    }

    @Override
    public  void run() {
        System.out.println("Multiplication Table of "+num);
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
