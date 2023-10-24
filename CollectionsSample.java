
//Given a sentence and asked to count the occurrence of each word and finally print the words in alphabetical order with their counts.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashSet;

public class CollectionsSample {

    public static void main(String[] args) {

        System.out.println("Hello");
        String sen = "Integrate banking and payment solutions into your business processes using our proven modern card issuing and platform";
        sen = sen.toLowerCase();
        String[] words = sen.split(" ");

        Map t1 = new TreeMap<>();//Sorted and no duplicates
        HashMap<Integer, String> h1 = new HashMap<>(); //Not sorted, more of k/v
        HashSet<String> hs1 = new HashSet<>();//Not sorted, no duplicates 
 

        for (int i = 0; i < words.length; i++) {
            t1.put(words[i], words[i].length());
            h1.put(i, words[i]);
            hs1.add(words[i]);

        }
        System.out.println("Tree Map Words length is: " + t1.size() + "\n Words are: \n" + t1 + "\n\n");
        System.out.println("Hash Map Words length is: " + h1.size() + "\n Words are: \n" + h1 + "\n\n");
        System.out.println("Hash Set Words length is: " + hs1.size() + "\nWords are: \n" + hs1 + "\n\n");
    }

}
