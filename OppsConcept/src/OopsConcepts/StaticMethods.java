package OopsConcepts;
//Write a Java program to showcase the concept of Static Methods and try to explore the scenarios when a static method tries to access or changes the value or functionality of a non-static member ( like variable , method ).
public class StaticMethods {
public static void main(String[]args){
    System.out.println("Inside main from class StaticMethods");
    StaticMethodDemo.greet();
}

}
class StaticMethodDemo{
    int a;
    static int b;
    static{
        b=10;
    }
    public static void greet(){
        System.out.println("Hello everyone,inside StaticMethodDemo");
    }
    public static int modifyValue(){
        b=20;
        return b;
    }
}
