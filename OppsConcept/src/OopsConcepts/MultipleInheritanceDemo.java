package OopsConcepts;
//Write a Java program to achieve multiple inheritance in Java
public class MultipleInheritanceDemo {
    public static void main(String[]args){
        Execute ex=new Execute();
        ex.function1();
        ex.function2();
        ex.function3();
    }
}
interface Interface1{
  void  function1();
  void function2();
}
interface Interface2{
    void function1();
    void function3();
}
class Execute implements Interface1,Interface2{
    //we can not override or call the method which is present in both the parent class because of ambiguity and that's why
    //we can not achieve multiple inheritance by extending classes but we can achieve using interface
    @Override
    public void function1() {
        System.out.println("Implementing the function1 method");
    }
    @Override
    public void function3() {
        System.out.println("Implementing the function3 method of interface2");
    }

    @Override
    public void function2() {
        System.out.println("Implementing the function2 method of interface1");
    }
}
