package CollectionTask.StringCollectionTask;

import java.util.LinkedHashSet;
import java.util.Scanner;


/*
Task
● Create a String collection and store 20 elements in it
● Elements stored should not be repeated.
● Elements stored should preserve the insertion order
● Implement different methods for this collection
 */
public class StringTask {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        LinkedHashSet<String> set=new LinkedHashSet<>();

        System.out.println("Enter 20 String elements");
 //..............................................................................
        //Adding elements in set;
       while(set.size()!=5){
            set.add(scanner.next());
        }
        System.out.println(set);
//...................................................................................
       //Removing elements from set
       System.out.println("Enter an element to remove");
       String element=scanner.next();
       if(set.contains(element))
       {
           set.remove(element);
           System.out.println("The element "+element+" is removed from set");
           System.out.println(set);
       }
       else
           System.out.println("The element is not present in set");

//......................................................................................

       //check if two sets are equal
       LinkedHashSet<String> set1=new LinkedHashSet<>();
       LinkedHashSet<String> set2=new LinkedHashSet<>();
       set1.add("hii");
       set1.add("i");
       set1.add("am");
       set1.add("rashi");
       set2.add("hii");
       set2.add("i");
       set2.add("rashi");
       set2.add("am");
       if(set1.equals(set2))
           System.out.println("Sets are equal");
       else
           System.out.println("Sets are not equal");
       //The order of elements do not affect the set;

    }

}
