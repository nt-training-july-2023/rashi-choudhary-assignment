package OopsConcepts;
//Write a Java program to showcase the use of Final Method. Show with an example what is difference of advantage of declaring a method as Final over declaring the entire class as Final
public class FinalMethod {
    public static void main(String[]args){
HelperDemo helperdemo=new HelperDemo();
helperdemo.display();
    }
}
class Helper{
    public  final void info(){
        System.out.println("This is helper class");
    }
    public void display(){
        System.out.println("Inside the class helper");
    }
}
class HelperDemo extends Helper{
    public void display(){
        System.out.println("Inside the class HelperDemo");
    }
    // Below method will give error "info()' cannot override 'info()' in 'OopsConcepts.Helper'; overridden method is final"
//    public final void info(){
//        System.out.println("This is HelperDemo class");
//    }

}

