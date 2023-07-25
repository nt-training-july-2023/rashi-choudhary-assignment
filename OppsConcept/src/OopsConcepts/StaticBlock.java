package OopsConcepts;
//Write a Java program to illustrate the uses of Static Block and try to explore with the ordering of the Static block inside the class and the respective results when it gets executed from main
public class StaticBlock {
    static {
        System.out.println("In static block of StaticBlock");
    }
    public static void main(String[]args){
        StaticBlockDemo.display();

    }
    static {
        System.out.println("In static block of StaticBlock after main");
    }
}
class StaticBlockDemo{
    static int x;
    static {
        x=10;
    }
    public static void display(){
        System.out.println(x);
    }
    static {
        System.out.println("In static block of StaticBlockDemo");
    }
}
