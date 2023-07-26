package ThreadTask;

import java.util.Scanner;

public class CheckThread {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter second number");
        int num2=scan.nextInt();
        Thread addThread=new Add(num1,num2);
        Thread subThread=new Subtract(num1,num2);
        Thread mulThread=new Multiply(num1,num2);
        addThread.start();
        subThread.start();
        mulThread.start();

    }
}
class Add extends Thread{
    int num1;
    int num2;
    public Add(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void run() {
       System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
}
class Subtract extends Thread{
    int num1;
    int num2;
    public Subtract(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void run() {
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
}
class Multiply extends Thread{

    int num1;
    int num2;
    public Multiply(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void run() {
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
}
