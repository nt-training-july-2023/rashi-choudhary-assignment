package OopsConcepts;
//Write a Java program and explore all kinds of Nested ( Inner ) Classes
public class NestedInnerClassDemo {
    public static void main(String[]args){
        Outer ou=new Outer();
        Outer.Inner oi=ou.new Inner();
        oi.display();

    }
}
class Outer{
    private int outer_x=24;
    int outer_y=67;
//    public void display(){
//        System.out.println("Inside the class outer");
//    }
    class Inner{
        private int inner_x=45;
        public void display(){
            System.out.println("inner_x "+inner_x);
            System.out.println("outer_x "+outer_x);
            System.out.println("outer_y "+outer_y);
        }

    }

}
