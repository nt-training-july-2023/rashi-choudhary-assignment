package OopsConcepts;
//Write a Java program to showcase the concept of Static Class and try to explore what happens when using a static class, we want to access other non-static members of the Outer-Class.

public class StaticClass {
    public static void main(String []args){
        Organisation org=new Organisation("Cleaning");
        Organisation.SalaryDepartment sal=new Organisation.SalaryDepartment(50000,"XYZ");
        sal.display();

    }
}
class Organisation{
    static String department;
    static int employeeNo;
    public Organisation(String department){
        this.department=department;
        employeeNo++;
    }
    static class SalaryDepartment{
        double salary;
        String name;
        public SalaryDepartment(double salary,String name){
            this.name=name;
            this.salary=salary;
        }
        public void display(){
            System.out.println("name: "+name+" department: "+department+" salary: "+salary);
        }

    }
}

