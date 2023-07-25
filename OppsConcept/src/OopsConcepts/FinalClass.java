package OopsConcepts;
//Write a Java program to demonstrate the use of Final Class. Show with an example what is the advantage of declaring a class as Final.
//    There are two uses of a final class:
//Usage 1: One is definitely to prevent inheritance, as final classes cannot be extended. For example, all Wrapper Classes like Integer, Float, etc. are final classes. We can not extend them.
//    final class A
//    {
//        // methods and fields
//    }
//    // The following class is illegal
//    class B extends A
//    {
//        // COMPILE-ERROR! Can't subclass A
//    }
//    Usage 2: The other use of final with classes is to create an immutable class like the predefined String class. One can not make a class immutable without making it final.
public class FinalClass {
    public static void main(String[]args){
        Personal_Details pd=new Personal_Details("3456","234567898767",23890);
        System.out.println(pd);
    }

}
final class Personal_Details{
    private String pin;
    private String accountNo;
    private double accountBalance;
    public Personal_Details(String pin,String accountNo,double accountBalance){
        this.accountBalance=accountBalance;
        this.accountNo=accountNo;
        this.pin=pin;
    }

    @Override
    public String toString() {
        return "Personal_Details{" +
                "pin='" + pin + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }
}
//Not possible as we can not extend the final class;
//class AnotherCustomer extends Personal_Details{
//
//}

