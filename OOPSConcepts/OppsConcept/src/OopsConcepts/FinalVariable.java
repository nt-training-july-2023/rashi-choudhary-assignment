package OopsConcepts;
//Write a Java program to demonstrate the use of Final Variable
public class FinalVariable {
    public static void main(String[]args){
        School stud1=new School("Aman","Fregunj Ujjain");
        School stud2=new School("Suman","Nanakheda Bus stand,Ujjain");
        System.out.println(stud1);
        System.out.println(stud2);

    }
}
class School{
    final String SCHOOL_NAME="Aadharshila Academy";
    final String SCHOOL_ADDRESS ="Ujjain,MP";
    //if i try to change the above strings then it is not possible like
//    public School(String SCHOOL_NAME,String ADDRESS){
//        this.SCHOOL_NAME=SCHOOL_NAME;
//        this.SCHOOL_ADDRESS=ADDRESS;
//    }
    //it will show error "Cannot assign a value to final variable 'SCHOOL_NAME'"
    //if we try this way
   // SCHOOL_ADDRESS="INDORE";
    //it will also give error;
    String studentName;
    String studentAddress;
    //This works perfectly as they are not final variable and initiallized multiple times
    public School(String studentName,String studentAddress){
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }

    @Override
    public String toString() {
        return "School{" +
                "SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", SCHOOL_ADDRESS='" + SCHOOL_ADDRESS + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
