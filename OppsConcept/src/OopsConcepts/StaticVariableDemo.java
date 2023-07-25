package OopsConcepts;
//Write a Java program to illustrate the uses of Static Variables .
public class StaticVariableDemo {
    public static void main(String[]args){
        Bank customer1=new Bank("Rashi Choudhary","Indore",24);
        Bank customer2=new Bank("Harshit Choudhary","Bhopal",19);
        Bank customer3=new Bank("Nitin Choudhary","Sanwer",44);
        customer3.viewCustomerCount();
        customer3.viewDetails();
    }
}
class Bank{
    static int customerCount;
    static String bankName="SBI";
     String customerName;
     String customerAddress;
    int age;
    public Bank(String customerName,String customerAddress,int age){
        this.customerName=customerName;
        this.customerAddress=customerAddress;
        this.age=age;
        customerCount++;
    }
    public void viewCustomerCount(){
        System.out.println("Total number of customers in bank are "+customerCount);
    }
    public void viewDetails(){
        System.out.println(customerName+" of age "+age+" belongs to "+customerAddress+" has account in "+bankName);
    }
}
