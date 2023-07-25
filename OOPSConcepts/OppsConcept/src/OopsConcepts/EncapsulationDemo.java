package OopsConcepts;
//Write a Java program to illustrate the concept of Encapsulation.
public class EncapsulationDemo {
    public static void main(String[]args){
        StudentData stu1=new StudentData(101,"Aman","Vijaynagar Indore",14);
        StudentData stu2=new StudentData(102,"Suman","Rajwada Indore",15);
        System.out.println(stu1.getAddress());
        System.out.println(stu2.getAge());
        System.out.println(stu1);
    }
}
 class StudentData{
    int rollNo;
    String name;
    String address;
    int age;
    public StudentData(int roll,String name,String address,int age){
        rollNo=roll;
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public void setRollNo(int roll){
        rollNo=roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getRollNo(){
        return rollNo;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

     @Override
     public String toString() {
         return "StudentData{" +
                 "rollNo=" + rollNo +
                 ", name='" + name + '\'' +
                 ", address='" + address + '\'' +
                 ", age=" + age +
                 '}';
     }
 }
