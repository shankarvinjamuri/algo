import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };

        findDuplicates(arr);
    }

    public static void findDuplicatesWithHash(int[] arr) {
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

    public static void findDuplicates(int[] arr) {

        int size = arr.length;
        List<Integer> origList = new ArrayList<>();
        List<Integer> dupList = new ArrayList<>();

        if (size <= 1)
            System.out.println("Array empty or has only one value, so not applicavble for duplicate chcek");

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    if (!dupList.contains(arr[i])) {

                        dupList.add(arr[i]);
                    }
                } else {
                    if (!origList.contains(arr[i])) {

                        origList.add(arr[i]);
                    }
                }
            }
        }

        System.out.println("No Dups List: " + origList);// Print origList.
        System.out.println("Dups only List: " + dupList);// Print DupList.

    }
}
