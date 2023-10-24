
//Given a sentence and asked to count the occurrence of each word and finally print the words in alphabetical order with their counts.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class FinAWordInSentence {

    public static void main(String[] args) {

        System.out.println("Hello");
        String sen = "Integrate banking and payment solutions into your business processes using our proven modern card issuing platform";
        sen = sen.toLowerCase();
        String[] words = sen.split(" ");

        Map wordsAndCount = new TreeMap<>();
        HashMap<Integer, String> h1 = new HashMap<>();
        HashSet<String> hs1 = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            wordsAndCount.put(words[i], words[i].length());
            h1.put(i, words[i]);
            hs1.add(words[i]);

        }
        System.out.println("Tree Map Words: " + wordsAndCount);
        System.out.println("Hash Map Words: " + h1);
        System.out.println("Hash Set Words: " + hs1);

    }

}
