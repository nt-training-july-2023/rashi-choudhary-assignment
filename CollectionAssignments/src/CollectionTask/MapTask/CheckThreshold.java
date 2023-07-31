package CollectionTask.MapTask;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer representing the threshold size, write a method which would print all the
elements existing in the map and then clear the map if the size of the map is equal to or greater
than the threshold size provided as input. There would be another method which would add the
elements in the map.
 */
public class CheckThreshold {
    public static void main(String[]args){
        int threshold=4;
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
    }
    public static class addElements{
    }
}
