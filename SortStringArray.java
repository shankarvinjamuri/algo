
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringArray {
    public static void sortArrays(List<String> stringList) {

        // Using Collections.sort() to sort the list of strings
        Collections.sort(stringList);

        System.out.println("Sorted List of Strings:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("blueberry");

        sortArrays(stringList);
    }
}
