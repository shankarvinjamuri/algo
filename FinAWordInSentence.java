
//Given a sentence and asked to count the occurrence of each word and finally print the words in alphabetical order with their counts.

import java.util.Map;
import java.util.TreeMap;

public class FinAWordInSentence {

    public static void main(String[] args) {

        System.out.println("Hello");
        String sen = "Integrate banking and payment solutions into your business processes using our proven modern card issuing platform";
        sen  = sen.toLowerCase();
        String[] words = sen.split(" ");

        Map wordsAndCount = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            wordsAndCount.put(words[i], words[i].length());

        }
        System.out.println("Words: " + wordsAndCount);
    }

}
