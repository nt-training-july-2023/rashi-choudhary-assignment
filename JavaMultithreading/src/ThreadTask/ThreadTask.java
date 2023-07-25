package ThreadTask;
// Create a Program which can take input (int)(Ex-10 and display all the numbers below 10 that is 1-9)and perform task-Reverse the list,Fibonacci,Sum of all the numbers.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadTask {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<num;i++){
            ls.add(i);
        }
        System.out.println("The resultant list is: "+ls);
        Fibonacci threadFib=new Fibonacci(num);
        threadFib.run();
        Reverse threadRev=new Reverse(ls);
        threadRev.run();
        Sum threadSum=new Sum(ls);
        threadSum.run();
    }


}
class Reverse extends Thread{
    List<Integer> list;
    public Reverse(List<Integer> ls){
        list=ls;
    }
    @Override
    public  void run() {
        int start=0,end=list.size()-1;
        while(start<end){
            int temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;

        }
       System.out.println("The reverse list is: "+list);
    }

}
class Fibonacci extends Thread{
    int num;
    public Fibonacci(int num){
        this.num=num;
    }
    @Override
    public void run() {
        int a=0,b=1,c=0;
        System.out.print("The fibonacci series of "+num+" numbers is "+a+" ");
        System.out.print(b+" ");
        while(num-2>0){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            num--;
        }
        System.out.println();
    }
}
class Sum extends Thread{
    List<Integer> list;
    public Sum(List<Integer> ls){
        list=ls;
    }
    @Override
    public void run() {
        int sum=0;
        for(int a:list){
            sum+=a;
        }
        System.out.println("The sum of number of list "+list+" is "+sum);
    }

}

