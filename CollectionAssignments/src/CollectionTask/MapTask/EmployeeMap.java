package CollectionTask.MapTask;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101,"Rashi Choudhary");
        map.put(102,"Meghana Nahar");
        map.put(103,"Nikita Patidar");
        map.put(104,"Harshit Choudhary");
        map.put(105,"Divya Rena");
        //Iterating through the keys of map
        for(Integer i:map.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
       //Adding elements to map
        System.out.println("Enter Key (Employee id)");
        Integer key=scan.nextInt();
        System.out.println("Enter Value( Employee name)");
        String value=scan.next();
        AddElements ae=new AddElements(map);
        ae.addElements(key,value);
        //Check whether the map contains the key or value.
       CheckElements ce=new CheckElements(map);
       System.out.println("Enter a key to check");
       Integer hkey=scan.nextInt();
       ce.checkKey(hkey);
       System.out.println("Enter a value to check");
       String hvalue=scan.next();
       ce.checkValue(hvalue);

        //Retrieve all the keys and all the values and print them on the console separately.
       RetrieveElements rt=new RetrieveElements(map);
       rt.retrieveKey();
       rt.retrieveValue();

    }
}
class RetrieveElements{
    HashMap<Integer,String> map;
    public RetrieveElements(HashMap<Integer,String> map){
        this.map=map;
    }
    public void retrieveKey(){
        System.out.println("The keys of map are: ");
        for(Integer mapKey:map.keySet()){
            System.out.print(mapKey+", ");
        }
    }
    public void retrieveValue(){
        System.out.println();
        System.out.println("The values of map are");
        for (String mapValue:map.values()){
            System.out.print(mapValue+", ");
        }
    }
}
class CheckElements {
    HashMap<Integer,String> map;
    public CheckElements(HashMap<Integer,String> map){
        this.map=map;
    }
    public void checkKey(Integer key){
        if(map.containsKey(key))
            System.out.println("key "+key+" is present in map");
        else
           System.out.println("Key is not present");
    }
    public void checkValue(String name){
        if(map.containsValue(name))
            System.out.println("The value "+name+" is present in map");
        else
            System.out.println("The value is not present");
    }
}
class AddElements{
    HashMap<Integer,String> map;
    public AddElements(HashMap<Integer,String> map){
        this.map=map;
    }
    public void addElements(Integer id,String name){
        map.put(id,name);
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
      }
    }
}
//Implement basic CRUD operations(Add,Remove,Update,Get) on the different types of Maps.
class ModifyMap{
    HashMap<Integer,String> map;
    public ModifyMap(HashMap<Integer,String> map){
        this.map=map;
    }
    public void getValue(Integer key){
        System.out.println("The value associated with key "+key+" is :"+map.get(key));
    }
    public void addValue(Integer key, String value){
        AddElements ae=new AddElements(map);
        ae.addElements(key,value);
    }
    public void updateValue(Integer key,String newValue){
        if(map.containsKey(key)){
            map.put(key,newValue);
            System.out.println("The value is updated");
        }
        else System.out.println("The key is not present");
    }
    public void removeKey(Integer key){
        if(map.containsKey(key)) {
            map.remove(key);
            System.out.println("The key "+key+" is removed");
        }
        else
            System.out.println("The key does not exist");
    }
    public void getValueMap(Integer key){
        if(map.containsKey(key)){
            System.out.println(map.get(key));
        }
        else{
            System.out.println("Key is not present");
        }
    }
    //Given a map, remove the key value pair if and only if the kay is mapped to that particular value.
    public void removeIfMapped(Integer key,String value){
        if(map.get(key)==value){
            map.remove(key);
            System.out.println("The key is deleted");
        }
        else{
            System.out.println("The entered key is not mapped to entered value so the key is not deleted");

        }
    }
}
