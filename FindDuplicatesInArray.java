import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 5, 6, 3 };

        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int value : arr) {
            if (!uniqueSet.add(value)) {
                // If the value is already in uniqueSet, it's a duplicate
                duplicateSet.add(value);
            }
        }

        System.out.println("Duplicates in the array: " + duplicateSet);
        System.out.println("Original in the array: " + uniqueSet);

    }
}
