package CollectionTask.MapTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Given an integer representing the threshold size, write a method which would print all the
elements existing in the map and then clear the map if the size of the map is equal to or greater
than the threshold size provided as input. There would be another method which would add the
elements in the map.
 */
public class CheckThreshold {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int threshold=10;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map.put(8,9);
        map.put(10,11);
        map.put(13,15);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        if(map.size()>=threshold)
            map.clear();

        System.out.println("Enter the key to add to map");
        int key=scanner.nextInt();
        System.out.println("Enter the value");
        int value=scanner.nextInt();
        CheckThreshold ct=new CheckThreshold();
        ct.addElements(map,key,value);
    }
    public void addElements(HashMap<Integer,Integer> map,int key,int value){
        map.put(key,value);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
