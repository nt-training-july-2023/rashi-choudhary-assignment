package CollectionTask.ComparableAndComparator;
//Implement Comparable and Comparator Interfaces to understand its functionality.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {
    public static void main(String[]args){
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student(101,"Rashi",78));
        list.add(new Student(102,"Meghana",89));
        list.add(new Student(103,"Nikita",76));
        // Using Comparable Interface;
//        Collections.sort(list);
//        for(Student st:list){
//            System.out.println("rollNo: "+st.rollNo+" name: "+st.name+" marks: "+st.marks);
//        }
        //Using Comparator interface;
        Collections.sort(list,new SortByMarks());
        for(Student st:list){
       System.out.println("rollNo: "+st.rollNo+" name: "+st.name+" marks: "+st.marks);
      }


    }

}
class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int marks;
    public Student(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student obj) {
        if( marks==obj.marks)
            return 0;
        else if(marks>obj.marks)
            return 1;
        else
            return -1;
    }
}
class SortByMarks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks-o2.marks;
    }
}