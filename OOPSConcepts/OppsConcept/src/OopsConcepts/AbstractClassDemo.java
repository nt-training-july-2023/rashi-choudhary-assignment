package OopsConcepts;
//Write a Java program to showcase the usage of Abstract Class
public class AbstractClassDemo {
    public static void main(String[]args){
        Aman aman=new Aman("Aman",14,"Avantipura Ujjain");
        aman.studentDetails();

    }
}
abstract class Student{
    public void schoolDetails(){
        System.out.println("Name:Aadharshila Academy Address: Near Taplobhumi,Ujjain");
    }
    public abstract void studentDetails();
}
class Aman extends Student{
    String name;
    int age;
    String address;
    public Aman(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void studentDetails(){
        System.out.println("Name: "+name+" Age: "+age+" Address: "+address);
    }
}
