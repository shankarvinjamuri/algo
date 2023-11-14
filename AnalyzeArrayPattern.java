public class AnalyzeArrayPattern {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // Change the array as needed

        String pattern = analyzeArrayPattern(arr);

        System.out.println("Array pattern: " + pattern);
    }

    public static String analyzeArrayPattern(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return "No Pattern (Array has 0 or 1 element)";
        }

        // Check for ascending pattern
        boolean isAscending = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isAscending = false;
                break;
            }
        }

        // Check for descending pattern
        boolean isDescending = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                isDescending = false;
                break;
            }
        }

        if (isAscending) {
            return "Ascending Pattern";
        } else if (isDescending) {
            return "Descending Pattern";
        } else {
            return "No Specific Pattern";
        }
    }
}
