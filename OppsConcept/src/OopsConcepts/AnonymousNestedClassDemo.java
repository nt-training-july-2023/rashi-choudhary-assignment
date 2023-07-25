package OopsConcepts;
//Write a Java program to override a method of an Anonymous Inner class multiple times
public class AnonymousNestedClassDemo {
    public static void main(String []args){
        Teacher teacher=new Teacher() {
            @Override
            public void greet() {
                System.out.println("Hello Everyone");
            }
        };
        teacher.greet();
        Director director=new Director() {
            @Override
            public void greet() {
                System.out.println("Hello teachers");
            }
        };
        director.greet();
    }

}
abstract class Teacher{
    public abstract void greet();
}
interface Director{
    public void greet();
}
