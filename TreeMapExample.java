//A TreeMap is an implementation of the SortedMap interface, and it uses a red-black tree to store key-value pairs. 
//It maintains the keys in sorted order, which makes it useful for applications that require ordered data.

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);

        System.out.println(treeMap);

        // Getting values from the tree map
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the tree map
        treeMap.remove("B");

        System.out.println(treeMap);

        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}