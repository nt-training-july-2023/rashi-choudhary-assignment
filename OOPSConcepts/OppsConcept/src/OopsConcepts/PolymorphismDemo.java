package OopsConcepts;
//Write a Java program to illustrate the concept of Polymorphism
public class PolymorphismDemo {
    public static void main(String[]args){
       Operation op=new Operation();
       System.out.println("sum of 10 and 20 is "+op.add(10,20));
        System.out.println("sum of 10,20 and 30 is "+op.add(10,20,30));
       FloatOperation fo=new FloatOperation();
       System.out.println("The sum of 10.5 and 10.7 is "+fo.add(10.5,10.7));
        System.out.println("The sum of 10.5,10.7 and 19.5 is "+fo.add(10.5,10.7
        ,19.5));
    }
}
class Operation{
    public int add(int i,int j){
        return i+j;
    }
    public int add(int i,int j,int k){
        return i+j+k;
    }

}
class FloatOperation extends Operation{
    public double add(double i,double j){
        return i+j;
    }
    public double add(double i,double j,double k){
        return i+j+k;
    }
}


