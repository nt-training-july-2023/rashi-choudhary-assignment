package CollectionTask.IntegerCollectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter 20 numbers");
        for(int i=0;i<20;i++){
            list.add(scanner.nextInt());
        }
        System.out.println("The entered list is :"+list);
        ReverseElements reverseElements=new ReverseElements(list);
        reverseElements.reverseList();
        DisplayElements displayElements=new DisplayElements(60);
        displayElements.displayElements();
        System.out.println(" ");
        UpdateElements updateElements=new UpdateElements(5,50,list);
        updateElements.updateList();


    }
}
class DisplayElements{
    int num;
    public DisplayElements(int num){
        this.num=num;
    }
    public void displayElements(){
        for(int i=1;i<num;i++){
            System.out.print(i+" ");
        }
    }

}
class ReverseElements{
    ArrayList<Integer> list;
    public ReverseElements(ArrayList<Integer> list){
        this.list=list;
    }
    public void reverseList(){
        Collections.reverse(list);
        System.out.println(list);
    }

}
class UpdateElements{
    int addNum;
    int checkNum;
    ArrayList<Integer> list;
    public UpdateElements(int addNum,int checkNum,ArrayList<Integer> list){
        this.addNum=addNum;
        this.checkNum=checkNum;
        this.list=list;
    }
    public void updateList(){
        for(int i=0;i<list.size();i++){
            if(list.get(i)>checkNum)
                list.set(i,list.get(i)+addNum);
        }
        System.out.println(list);
    }

}

