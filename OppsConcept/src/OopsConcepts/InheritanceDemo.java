package OopsConcepts;
//Write a Java program to illustrate the concept of all types of Inheritance
public class InheritanceDemo {
    public static void main(String[]args){
        Company c=new Company();
        System.out.println(c);
        Employee emp1= new Employee("Operation","Aman",24,"Omax city 1,Indore");
        System.out.println(emp1);
        Engineers pg1=new Engineers("Operation","Aman",24,"Omax city 1,Indore",50000,5000);
        System.out.println(pg1);
        Interns int1=new Interns("Operation","Shyam",24,"Ranjit Hanuman,Indore",25000,6);
        System.out.println(int1);
    }
}
class Company{
  final String COMPANY_NAME="NucleusTeq";
  final String COMPANY_ADDRESS="Brilliant Platina,VijayNagar";

    @Override
    public String toString() {
        return "Company{" +
                "COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", COMPANY_ADDRESS='" + COMPANY_ADDRESS + '\'' +
                '}';
    }
}
//Single Inheritance
class Employee extends Company{
    String department;
    String name;
    int age;
    String address;
public Employee(){}
    public Employee(String department,String name,int age,String address) {
super();
        this.address=address;
        this.age=age;
        this.department=department;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", COMPANY_ADDRESS='" + COMPANY_ADDRESS + '\'' +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
//Multilevel Inheritance: Company is parent class of Employee and Employee is parent class of Programmer
class Engineers extends Employee{
    double salary;
    double bonus;
    public Engineers(String department,String name,int age,String address,double salary,double bonus){
        super(department, name, age, address);
        this.salary=salary;
        this.bonus=bonus;

    }

    @Override
    public String toString() {
        return "Engineers{" +
                "COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", COMPANY_ADDRESS='" + COMPANY_ADDRESS + '\'' +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                "salary=" + salary +
                ", bonus=" + bonus +

                '}';
    }
}
//Hierarchical Inheritance Both Programmers and Interns are sub class of employee class
class Interns extends Employee{
    double stipend;
    double timePeriod;
    public Interns(String department,String name,int age,String address,double stipend,double timePeriod){
        super(department, name, age, address);
        this.stipend=stipend;
        this.timePeriod=timePeriod;
    }

    @Override
    public String toString() {
        return "Interns{" +
                "COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", COMPANY_ADDRESS='" + COMPANY_ADDRESS + '\'' +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                "stipend=" + stipend +
                ", timePeriod=" + timePeriod +
                '}';
    }
}
