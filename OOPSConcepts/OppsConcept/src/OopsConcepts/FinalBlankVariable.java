package OopsConcepts;
//Write a Java program to show the various ways of initializing a final blank variable . ( like a constructor and other ways ).
public class FinalBlankVariable {
    final double pi=3.141592653589793;// this is one way of declaring the final variable;
    final double interest;//If we left the final variable uninitialised then it is called Blank Final Variable
    //We can initialise it using instance-initializer block
    {
        interest=20;
    }
    static final String  BANK_NAME="SBI"; //Static variable can also be final .It is one way of declaring the static final variable by initilizing it at the same time;
    static final String IFSC_CODE;//This type of declaration is Blank static final variable
    //we can initialise it using static block
    static{
        IFSC_CODE="NA678L568";
    }
    String customerName;
    int age;
    public FinalBlankVariable(String customerName,int age){
        this.customerName=customerName;
        this.age=age;

    }

    @Override
    public String toString() {
        return "FinalBlankVariable{" +
                "pi=" + pi +
                ", interest=" + interest +
                ", customerName='" + customerName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[]args){
        FinalBlankVariable cust1=new FinalBlankVariable("Aman",44);
        FinalBlankVariable cust2=new FinalBlankVariable("Shyam",34);
        System.out.println(cust1);
        System.out.println(cust2);
    }
}

