package StringHandling;

public class StringEquals {
    public static void main(String[]args){
        String name1="Aman";
        String name2="Aman";
        if(name1==name2){
            System.out.println("String literals are equal");
        }
        // output will be "String literals are equal" as when we initiallize the strings as aman it will be stored in
        //string pool and both name1 and name2 are pointing to same location

        String name3=new String("Aman");
        String name4=new String("Aman");
        if(name3==name4){
            System.out.println("Object are same");
        }
        // This statement will not work as using == opeartor we are comparing the address of reference variable
        // name3 and name4 not the actual string in it ,here we need to use equals()method
        if(name3.equals(name4))
            System.out.println("Strings are equal");
        if(name3.equals(name1))
            System.out.println("Strings are equal");
    }
}
